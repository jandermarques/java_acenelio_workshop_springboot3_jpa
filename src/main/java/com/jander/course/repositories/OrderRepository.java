package com.jander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jander.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
