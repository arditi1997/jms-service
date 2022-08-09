package com.jms.service.controller;

import com.jms.service.exception.CustomException;
import com.jms.service.exception.ErrorCode;
import com.jms.service.model.Product;
import com.jms.service.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    private ProductService productService;

    public Controller(ProductService productService){
       this.productService = productService;
    }

    @PostMapping("/send/product/queue")
    public void sendQueueMessage(@RequestBody Product product) throws JMSException {
        if(product == null)
            throw new CustomException(ErrorCode.BAD_REQUEST);
        productService.sendQueueProduct(product);
    }
}
