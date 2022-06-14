package com.example.billingsoftware.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="orderdetails_billingsoftware")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="od_id")
	private long od_id;
	
	@NotNull
	@Column(name="od_p_id")
	private long od_p_id;
	
	@NotNull
	@Column(name="od_quantity")
	private double od_quantity;
	
	@Column(name="od_subTotal")
	private double od_subTotal;
	
	//delivery foreign key
	

	@OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "o_id")
	//@JsonIgnoreProperties("orderDetails")
	@Column(name="od_o_id")
	private long od_o_id;
}
