package com.fsamu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsamu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
