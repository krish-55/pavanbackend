package com.pavan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavan.demo.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
