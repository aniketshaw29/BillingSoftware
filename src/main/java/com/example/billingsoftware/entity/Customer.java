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


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer_billingsoftware")
public class Customer {
	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long c_id;
	
	@Column(name="c_name")
	@NotNull
	@Size(min = 2,message = "Name should have atleast 2 character")
	private String c_name;
	
	@Column(name="c_phone", unique = true)
	@NotNull 
	@Size(min = 10,message = "Phone no. must be of 10 numbers")
	private long c_phone;
	
	@Column(name="c_email", unique = true)
	private String email;
	
	@Column(name="c_address_street_name")
	@NotNull
	private String c_address_street_name;
	
	@Column(name="c_address_landmark")
	@NotNull
	private String c_address_landmark;
	
	@Column(name="c_address_district")
	@NotNull
	private String c_address_district;
	
	@Column(name="c_address_state")
	@NotNull
	private String c_address_state;
	
	@Column(name="c_address_pincode")
	@NotNull
	private int c_address_pincode;
	
	@Column(name="c_upi_id", unique = true)
	private String c_upi_id;
}
