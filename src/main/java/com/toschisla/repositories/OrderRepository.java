package com.toschisla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toschisla.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
