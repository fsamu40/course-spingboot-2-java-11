package com.fsamu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsamu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
