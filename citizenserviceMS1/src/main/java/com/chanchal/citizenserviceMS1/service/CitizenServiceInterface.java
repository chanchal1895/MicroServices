package com.chanchal.citizenserviceMS1.service;

import org.springframework.http.HttpStatus;

import com.chanchal.citizenserviceMS1.entity.Citizen;

public interface CitizenServiceInterface {

	public Citizen saveCitizenDetails(Citizen citizen);

	public Citizen getCitizenById(Integer id) throws Exception;

	public String getCitizenNameById(Integer id) throws Exception;

	

}
