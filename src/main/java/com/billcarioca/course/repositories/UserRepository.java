package com.billcarioca.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billcarioca.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
