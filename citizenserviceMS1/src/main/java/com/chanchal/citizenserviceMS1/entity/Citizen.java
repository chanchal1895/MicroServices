package com.chanchal.citizenserviceMS1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int vaccinationId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVaccinationId() {
		return vaccinationId;
	}
	public void setVaccinationId(int vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
	public Citizen(int id, String name, int vaccinationId) {
		super();
		this.id = id;
		this.name = name;
		this.vaccinationId = vaccinationId;
	}
	public Citizen() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", vaccinationId=" + vaccinationId + "]";
	}
	
	
}
