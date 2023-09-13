package com.demonstration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demonstration.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
