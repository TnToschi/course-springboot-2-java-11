package com.toschisla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toschisla.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
