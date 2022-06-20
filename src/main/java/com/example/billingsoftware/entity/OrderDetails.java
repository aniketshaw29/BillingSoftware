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
	
	@OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "o_id")
	private long od_o_id;

	public long getOd_id() {
		return od_id;
	}

	public void setOd_id(long od_id) {
		this.od_id = od_id;
	}

	public long getOd_p_id() {
		return od_p_id;
	}

	public void setOd_p_id(long od_p_id) {
		this.od_p_id = od_p_id;
	}

	public double getOd_quantity() {
		return od_quantity;
	}

	public void setOd_quantity(double od_quantity) {
		this.od_quantity = od_quantity;
	}

	public double getOd_subTotal() {
		return od_subTotal;
	}

	public void setOd_subTotal(double od_subTotal) {
		this.od_subTotal = od_subTotal;
	}

	public long getOd_o_id() {
		return od_o_id;
	}

	public void setOd_o_id(long od_o_id) {
		this.od_o_id = od_o_id;
	}

	public OrderDetails(long od_id, @NotNull long od_p_id, @NotNull double od_quantity, double od_subTotal,
			long od_o_id) {
		super();
		this.od_id = od_id;
		this.od_p_id = od_p_id;
		this.od_quantity = od_quantity;
		this.od_subTotal = od_subTotal;
		this.od_o_id = od_o_id;
	}

	public OrderDetails() {
		super();
	}
}
