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
@Table(name="customer_billingsoftware")
public class Customer {
	@Id
	@Column(name="c_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long c_id;
	
	@Column(name="c_name", length = 22)
	@NotNull
	@Size(min = 2,message = "Name should have atleast 2 character")
	private String c_name;
	
	@Column(name="c_phone", length = 10, unique = true)
	@NotNull 
	@Size(min = 10,message = "Phone no. must be of 10 numbers")
	private long c_phone;
	
	@Column(name="c_email", length = 100, unique = true)
	private String email;
	
	@Column(name="c_address_street_name", length = 35)
	@NotNull
	private String c_address_street_name;
	
	@Column(name="c_address_landmark", length = 22)
	@NotNull
	private String c_address_landmark;
	
	@Column(name="c_address_district", length = 22)
	@NotNull
	private String c_address_district;
	
	@Column(name="c_address_state", length = 22)
	@NotNull
	private String c_address_state;
	
	@Column(name="c_address_pincode", length = 6)
	@NotNull
	private int c_address_pincode;
	
	@Column(name="c_upi_id", length = 50,  unique = true)
	private String c_upi_id;

	public long getC_id() {
		return c_id;
	}

	public void setC_id(long c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public long getC_phone() {
		return c_phone;
	}

	public void setC_phone(long c_phone) {
		this.c_phone = c_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getC_address_street_name() {
		return c_address_street_name;
	}

	public void setC_address_street_name(String c_address_street_name) {
		this.c_address_street_name = c_address_street_name;
	}

	public String getC_address_landmark() {
		return c_address_landmark;
	}

	public void setC_address_landmark(String c_address_landmark) {
		this.c_address_landmark = c_address_landmark;
	}

	public String getC_address_district() {
		return c_address_district;
	}

	public void setC_address_district(String c_address_district) {
		this.c_address_district = c_address_district;
	}

	public String getC_address_state() {
		return c_address_state;
	}

	public void setC_address_state(String c_address_state) {
		this.c_address_state = c_address_state;
	}

	public int getC_address_pincode() {
		return c_address_pincode;
	}

	public void setC_address_pincode(int c_address_pincode) {
		this.c_address_pincode = c_address_pincode;
	}

	public String getC_upi_id() {
		return c_upi_id;
	}

	public void setC_upi_id(String c_upi_id) {
		this.c_upi_id = c_upi_id;
	}

	public Customer(long c_id, @NotNull @Size(min = 2, message = "Name should have atleast 2 character") String c_name,
			@NotNull @Size(min = 10, message = "Phone no. must be of 10 numbers") long c_phone, String email,
			@NotNull String c_address_street_name, @NotNull String c_address_landmark,
			@NotNull String c_address_district, @NotNull String c_address_state, @NotNull int c_address_pincode,
			String c_upi_id) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_phone = c_phone;
		this.email = email;
		this.c_address_street_name = c_address_street_name;
		this.c_address_landmark = c_address_landmark;
		this.c_address_district = c_address_district;
		this.c_address_state = c_address_state;
		this.c_address_pincode = c_address_pincode;
		this.c_upi_id = c_upi_id;
	}

	public Customer() {
		super();
	}
}
