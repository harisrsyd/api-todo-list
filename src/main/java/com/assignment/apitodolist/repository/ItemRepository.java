package com.assignment.apitodolist.repository;

import com.assignment.apitodolist.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
