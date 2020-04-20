package com.toschisla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toschisla.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
