package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.lti.model.Customer;
import com.lti.model.KafkaConstants;

@Service
public class CustomerService {
	
	@Autowired
	KafkaTemplate<String, Object> kafkaTemplate;
	
	public String add(List<Customer> customers) {
		
		for(Customer c : customers) {
			kafkaTemplate.send(KafkaConstants.TOPIC,c);
			System.out.println("************Msg published to Kafka topic***************");
		}
		return "Customer Records Added To Kafka Queue Successfully";

		
	}

}
