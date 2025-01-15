package com.assignment.apitodolist.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "boards")
public class Board {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   
   private String title;
   
   private Date createdAt;
   
   private String createdBy;
   
   private Date updatedAt;
   
   private String updatedBy;
   
   private boolean isDeleted;
   
   private Date deletedAt;
   
   private String deletedBy;
}
