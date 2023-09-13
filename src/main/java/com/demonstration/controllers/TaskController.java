package com.demonstration.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demonstration.model.Task;
import com.demonstration.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	  private final TaskRepository taskRepository;

	    public TaskController(TaskRepository taskRepository) {
	        this.taskRepository = taskRepository;
	    }

	    @GetMapping
	    public List<Task> getAllTasks() {
	        return (List<Task>) taskRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Task getTaskById(@PathVariable Long id) {
	        return taskRepository.findById(id).orElse(null);
	    }

	    @PostMapping
	    public Task createTask(@RequestBody Task task) {
	        return taskRepository.save(task);
	    }

	  /*  @PutMapping("/{id}")
	    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
	        return taskRepository.findById(id)
	                .map(existingTask -> {
	                    existingTask.setTitle(task.getTitle());
	                    existingTask.setCompleted(task.isCompleted());
	                    return existingTask;
	                })
	                .orElse(null);
	    }
*/
	    @DeleteMapping("/{id}")
	    public void deleteTask(@PathVariable Long id) {
	        taskRepository.deleteById(id);
	    }
}
