package com.example.raabbitmqreceiverpart.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class RabbitMQ {
 public static int count;
 @RabbitListener(queues = "${sample.rabbitmq.queue}")
 public void recievedMessage(String incomingMessage) {
	 count++;
	 System.out.println("Recieved Message From RabbitMQ: " + incomingMessage);
	 
 }
 
 @GetMapping(value="/numberofmessages")
 public int getNumberOfMessages() {
	return count;
	 
 }
 
 
}