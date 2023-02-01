package com.billcarioca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billcarioca.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
