package com.assignment.apitodolist.controller;

import com.assignment.apitodolist.model.UserRegisterRequest;
import com.assignment.apitodolist.model.WebResponse;
import com.assignment.apitodolist.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
   
   private UserService userService;
   
   public UserController(UserService userService) {
      this.userService = userService;
   }
   
   @PostMapping("/user/register")
   public WebResponse<String> register(@RequestBody UserRegisterRequest request) {
      userService.register(request);
      return WebResponse.<String>builder().status(HttpStatus.CREATED.value())
          .data("User registered successfully, You can access immediately with your username and password").build();
   }
}
