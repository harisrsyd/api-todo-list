package com.assignment.apitodolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
   @Id
   @Column(nullable = false, unique = true)
   private String username;
   
   @Column(nullable = false)
   private String name;
   
   @Column(nullable = false, unique = true)
   private String email;
   
   @Column(nullable = false)
   @Size(min = 8)
   private String password;
}
