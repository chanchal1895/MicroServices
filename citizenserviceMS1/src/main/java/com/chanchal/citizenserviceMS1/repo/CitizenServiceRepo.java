package com.chanchal.citizenserviceMS1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chanchal.citizenserviceMS1.entity.Citizen;

public interface CitizenServiceRepo extends JpaRepository<Citizen, Integer>{
	

}
