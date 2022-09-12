package com.suatogul.resttodoreact.data.repository;

import com.suatogul.resttodoreact.data.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
