package com.assignment.apitodolist.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebResponse<T> {
   
   private int status;
   
   private T data;
   
   private String error;
}
