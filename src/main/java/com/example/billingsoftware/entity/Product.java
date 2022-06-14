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
@Table(name="product_billingsoftware")
public class Product {
	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long p_id;
	
	@Column(name="p_name")
	@NotNull
	@Size(min = 2,message = "Product Name should have atleast 2 character")
	//unique
	private String p_name;
	
	@Column(name="p_rate")
	@NotNull
	private double p_rate;
}
