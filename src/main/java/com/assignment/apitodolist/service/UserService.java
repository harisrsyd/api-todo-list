package com.assignment.apitodolist.service;

import com.assignment.apitodolist.entity.User;
import com.assignment.apitodolist.model.UserRegisterRequest;
import com.assignment.apitodolist.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
   
   private UserRepository userRepository;
   private ValidationService validationService;
   
   public UserService(UserRepository userRepository, ValidationService validationService) {
      this.userRepository = userRepository;
      this.validationService = validationService;
   }
   
   @Transactional
   public void register(UserRegisterRequest request) {
      validationService.validate(request);
      if (userRepository.existsById(request.getUsername())) {
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists");
      }
      if (userRepository.existsByEmail(request.getEmail())) {
         throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already registered");
      }
      
      User user = new User();
      user.setUsername(request.getUsername());
      user.setName(request.getName());
      user.setEmail(request.getEmail());
      user.setPassword(request.getPassword());
      
      userRepository.save(user);
   }
   
   public User getUser(String username) {
      return userRepository.findById(username)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
   }
   
   
}
