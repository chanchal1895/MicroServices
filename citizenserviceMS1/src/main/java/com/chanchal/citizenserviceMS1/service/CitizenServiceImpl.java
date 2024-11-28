package com.chanchal.citizenserviceMS1.service;

import java.util.Optional;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chanchal.citizenserviceMS1.entity.Citizen;
import com.chanchal.citizenserviceMS1.repo.CitizenServiceRepo;

@Service
public class CitizenServiceImpl implements CitizenServiceInterface{

	@Autowired
	CitizenServiceRepo citizenServiceRepo;
	@Override
	public Citizen saveCitizenDetails(Citizen citizen) {
		// TODO Auto-generated method stub
		return citizenServiceRepo.save(citizen);
	}
	@Override
	public Citizen getCitizenById(Integer id) throws Exception  {
		// TODO Auto-generated method stub
		
		Optional<Citizen> op = citizenServiceRepo.findById(id);
		//op.isEmpty() is opposite to op.isPresent()
		if(op.isPresent()) 
			return citizenServiceRepo.findById(id).get();
		else 
			throw new Exception("Data not found");
		
	}
	public String getCitizenNameById(Integer id) throws Exception  {
		// TODO Auto-generated method stub
		Optional<Citizen> op = citizenServiceRepo.findById(id);
		//op.isEmpty() is opposite to op.isPresent()
		if(op.isPresent()) {
			
			Optional<String> name = Optional.ofNullable(op.get().getName());
			name.ifPresent(name1-> System.out.println("Name is"+name.get().toUpperCase()));
			name.ifPresentOrElse(name1-> System.out.println("Name is"+name.get().toUpperCase()), 
					()->System.out.println("Name is not present"));
		if(!name.isEmpty()) 
			return name.get().toUpperCase()	;
		else 
			throw new Exception("Name is Null");
		}
		else {
			throw new Exception("Data not found");
		}
		
	}

}
