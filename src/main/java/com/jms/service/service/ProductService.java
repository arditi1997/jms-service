package com.jms.service.service;

import com.jms.model.Product;

import javax.jms.JMSException;

public interface ProductService {
     void sendQueueProduct(Product product) throws JMSException;
}
