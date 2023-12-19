package com.lti.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Customer;
import com.lti.service.CustomerService;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@Autowired
	CustomerService service;

	@PostMapping("/addCust")
	public ResponseEntity<String> addCust(@RequestBody List<Customer> customers){
		System.out.println("restcontroler start");
		String response = service.add(customers);

		return new ResponseEntity<String>(response,HttpStatus.OK);
		
	}
	
}
