package com.fsamu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsamu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
