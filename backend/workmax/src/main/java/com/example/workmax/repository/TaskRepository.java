package com.example.workmax.repository;

import com.example.workmax.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface TaskRepository extends CrudRepository<Task,Integer> {

    public Iterable<Task> findAll();

    public Task findById(int taskId);

}
