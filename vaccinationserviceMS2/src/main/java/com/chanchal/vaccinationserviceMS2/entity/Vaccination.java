package com.chanchal.vaccinationserviceMS2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaccination 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccinationId;
	private String vaccinationCenterName;
	private String address;
	public int getVaccinationId() {
		return vaccinationId;
	}
	public void setVaccinationId(int vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
	public String getVaccinationCenterName() {
		return vaccinationCenterName;
	}
	public void setVaccinationCenterName(String vaccinationCenterName) {
		this.vaccinationCenterName = vaccinationCenterName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Vaccination(int vaccinationId, String vaccinationCenterName, String address) {
		super();
		this.vaccinationId = vaccinationId;
		this.vaccinationCenterName = vaccinationCenterName;
		this.address = address;
	}
	public Vaccination() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vaccination [vaccinationId=" + vaccinationId + ", vaccinationCenterName=" + vaccinationCenterName
				+ ", address=" + address + "]";
	}
	
	

}
