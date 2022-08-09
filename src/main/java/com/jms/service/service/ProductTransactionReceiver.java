package com.jms.service.service;

import com.jms.service.model.Product;
import com.jms.service.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ProductTransactionReceiver {

    private final static Logger log = LoggerFactory.getLogger(ProductTransactionReceiver.class);
    private ProductRepository productRepository;

    public ProductTransactionReceiver(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    private int count = 1;

    @JmsListener(destination = "queue", containerFactory = "myFactory")
    public void receiveQueueMesssage(Product product) {
        log.info("Transaction number "+ count + " received. Queue Product: " + product);
        productRepository.save(product);
        log.info("Transaction number "+ count + " saved in database");
        count++;
    }
}
