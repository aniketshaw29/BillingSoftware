package com.example.billingsoftware.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
	
}
