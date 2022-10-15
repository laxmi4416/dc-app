package com.example.demo.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Plan;
import com.example.demo.service.DcAppService;

@RestController
public class DcAppRestController {
	
	private DcAppService dcService;
	
	@GetMapping("/plan")
	public ResponseEntity<List<Plan>> getPlans() {
		List<Plan> list = dcService.getAllPlans();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
