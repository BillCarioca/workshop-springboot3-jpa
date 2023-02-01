package com.billcarioca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billcarioca.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
