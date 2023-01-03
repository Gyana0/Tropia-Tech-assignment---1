package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
