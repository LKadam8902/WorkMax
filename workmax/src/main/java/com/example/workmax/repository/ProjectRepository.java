package com.example.workmax.repository;

import com.example.workmax.entity.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project,Integer> {

    public Iterable<Project> findAll();

    public Project findById(int projectId);

}
