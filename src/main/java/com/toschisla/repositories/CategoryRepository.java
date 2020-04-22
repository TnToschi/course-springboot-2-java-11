package com.toschisla.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.toschisla.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
