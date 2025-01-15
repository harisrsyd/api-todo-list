package com.assignment.apitodolist.repository;

import com.assignment.apitodolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
   
   boolean existsByEmail(String email);
}
