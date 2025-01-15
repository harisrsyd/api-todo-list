package com.assignment.apitodolist.model;

import jakarta.validation.constraints.Size;

public class ChecklistRequest {
   
   @Size(max = 150, message = "Title must be less than 150 characters")
   private String title;
}
