package com.demonstration.repository;

import org.springframework.data.repository.CrudRepository;

import com.demonstration.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
