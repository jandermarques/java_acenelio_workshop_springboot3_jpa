package com.jander.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jander.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
