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


@Entity
@Table(name="order_billingsoftware")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="o_id")
	private long o_id;
	
	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	//@JsonIgnoreProperties("order")
	@Column(name="o_c_id")
	private long o_c_id;

	public long getO_id() {
		return o_id;
	}

	public void setO_id(long o_id) {
		this.o_id = o_id;
	}

	public long getO_c_id() {
		return o_c_id;
	}

	public void setO_c_id(long o_c_id) {
		this.o_c_id = o_c_id;
	}

	public Order(long o_id, long o_c_id) {
		super();
		this.o_id = o_id;
		this.o_c_id = o_c_id;
	}

	public Order() {
		super();
	}
}
