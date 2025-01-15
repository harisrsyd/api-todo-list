package com.assignment.apitodolist.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
public class UserRegisterRequest {
   
   @NotBlank(message = "Username is required")
   @Size(max = 100, message = "Username must be less than 100 characters")
   private String username;
   
   @NotBlank(message = "Name is required")
   @Size(max = 100, message = "Name must be less than 100 characters")
   private String name;
   
   @NotBlank(message = "Email is required")
   private String email;
   
   @NotBlank(message = "Password is required")
   @Size(min = 8, max = 100, message = "Password is too long")
   private String password;
}
