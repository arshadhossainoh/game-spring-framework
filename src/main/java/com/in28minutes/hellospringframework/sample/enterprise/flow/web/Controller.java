package com.in28minutes.hellospringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.hellospringframework.sample.enterprise.flow.business.BusinessService;

//sending response in the right format like jason
@RestController
public class Controller {
	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
}



