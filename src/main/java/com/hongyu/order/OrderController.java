package com.hongyu.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	@Autowired
	private  RestTemplate restTemplate;
	
	@GetMapping("/getOrder")
	public Object getMember(){
		String forEntity = restTemplate.getForObject("http://app-member/getMember", String.class);
		return forEntity;
	}

}
