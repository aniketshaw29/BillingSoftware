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
@Table(name="product_billingsoftware")
public class Product {
	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long p_id;
	
	@Column(name="p_name", length = 30)
	@NotNull
	@Size(min = 2,message = "Product Name should have atleast 2 character")
	//unique
	private String p_name;
	
	@Column(name="p_rate")
	@NotNull
	private double p_rate;

	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public double getP_rate() {
		return p_rate;
	}

	public void setP_rate(double p_rate) {
		this.p_rate = p_rate;
	}

	public Product(long p_id,
			@NotNull @Size(min = 2, message = "Product Name should have atleast 2 character") String p_name,
			@NotNull double p_rate) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_rate = p_rate;
	}

	public Product() {
		super();
	}	
}
