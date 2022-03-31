package com.maq.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "ORDR_DTLS")
@Data
public class OrderDetails {

	@Id
	@Column(name = "ORDER_ID")
	@GenericGenerator(name = "order_id_gen", strategy = "com.maq.generators.OrderIdGenerator")
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;

	@Column(name = "ORDER_BY")
	private String orderBy;

	@Column(name = "ORDER_PLACED_DT")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;

}
