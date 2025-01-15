package com.assignment.apitodolist.entity;

import jakarta.persistence.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Entity
@Accessors(chain = true)
@Table(name = "items")
public class Item {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   
   private String name;
   
   private String description;
   
   private boolean done;
   
   @ManyToOne
   @JoinColumn(name = "board_id")
   private Board board;
   
   private Date createdAt;
   
   private String createdBy;
   
   private Date updatedAt;
   
   private String updatedBy;
   
   private boolean isDeleted;
   
   private Date deletedAt;
   
   private String deletedBy;
}
