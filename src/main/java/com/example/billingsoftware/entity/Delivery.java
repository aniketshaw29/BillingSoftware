package com.example.billingsoftware.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="dilivery_billingsoftware")
public class Delivery {
	@Id
	@Column(name="d_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long d_id;
	
	@Column(name="d_name")
	@NotNull
	@Size(min = 2,message = "Name should have atleast 2 character")
	private String d_name;
	
	@Column(name="d_phone", unique = true)
	@NotNull 
	@Size(min = 10,message = "Phone no. must be of 10 numbers")
	private String d_phone;
	
	@Column(name="d_vehicleNumber", unique = true)
	private String d_vehicleNumber;
	
	@Column(name="d_aadharNumber", unique = true)
	private long d_aadharNumber;

	public long getD_id() {
		return d_id;
	}

	public void setD_id(long d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_phone() {
		return d_phone;
	}

	public void setD_phone(String d_phone) {
		this.d_phone = d_phone;
	}

	public String getD_vehicleNumber() {
		return d_vehicleNumber;
	}

	public void setD_vehicleNumber(String d_vehicleNumber) {
		this.d_vehicleNumber = d_vehicleNumber;
	}

	public long getD_aadharNumber() {
		return d_aadharNumber;
	}

	public void setD_aadharNumber(long d_aadharNumber) {
		this.d_aadharNumber = d_aadharNumber;
	}

	public Delivery(long d_id, @NotNull @Size(min = 2, message = "Name should have atleast 2 character") String d_name,
			@NotNull @Size(min = 10, message = "Phone no. must be of 10 numbers") String d_phone,
			String d_vehicleNumber, long d_aadharNumber) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_phone = d_phone;
		this.d_vehicleNumber = d_vehicleNumber;
		this.d_aadharNumber = d_aadharNumber;
	}

	public Delivery() {
		super();
	}
}
