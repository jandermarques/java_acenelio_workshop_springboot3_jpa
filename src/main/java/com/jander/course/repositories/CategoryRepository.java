package com.jander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jander.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
