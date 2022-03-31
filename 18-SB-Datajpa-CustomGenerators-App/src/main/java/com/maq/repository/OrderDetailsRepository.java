package com.maq.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maq.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Serializable> {

}
