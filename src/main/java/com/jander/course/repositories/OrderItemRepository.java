package com.jander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jander.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
