package com.chanchal.citizenserviceMS1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanchal.citizenserviceMS1.entity.Citizen;
import com.chanchal.citizenserviceMS1.service.CitizenServiceInterface;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
	
	Logger logger = LoggerFactory.getLogger(CitizenController.class);
	
	@Autowired
	CitizenServiceInterface citizenServiceInterface;
	
	
	@PostMapping("/save")
	public ResponseEntity<Citizen> saveCitizenDetails(@RequestBody Citizen citizen){
		return new ResponseEntity<Citizen>(citizenServiceInterface.saveCitizenDetails(citizen),HttpStatus.CREATED);
	}
	
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<?> getCitizenById(@PathVariable Integer id){
		try {
			return new ResponseEntity<Citizen>(citizenServiceInterface.getCitizenById(id), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}

	@GetMapping("/getNamebyid/{id}")
	public ResponseEntity<?> getCitizenNameById(@PathVariable Integer id){
		

		try {
				return new ResponseEntity<String>(citizenServiceInterface.getCitizenNameById(id), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("User not found with id: {}", id);
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
}
