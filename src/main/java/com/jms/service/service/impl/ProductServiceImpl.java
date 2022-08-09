package com.jms.service.service.impl;

import com.jms.service.model.JmsType;
import com.jms.service.model.Product;
import com.jms.service.service.ProductService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Queue;

@Service
public class ProductServiceImpl implements ProductService {

    private JmsTemplate jmsTemplate;

    public ProductServiceImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendQueueProduct(Product product) throws JMSException {
        Queue queue = jmsTemplate.getConnectionFactory().createConnection().createSession().createQueue("queue");
        product.setJmsType(JmsType.QUEUE.getName());
        jmsTemplate.convertAndSend(queue, product);
    }
}
