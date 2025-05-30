package com.example.workmax.service;


import com.example.workmax.entity.Task;
import com.example.workmax.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

   private TaskRepository taskRepository;

   public Iterable<Task> getAllTask(){
       return taskRepository.findAll();
   }

   public void assignTask(int taskId){
       Task task=taskRepository.findById(taskId);
   }

}
