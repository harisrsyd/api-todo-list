package com.assignment.apitodolist.repository;

import com.assignment.apitodolist.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
