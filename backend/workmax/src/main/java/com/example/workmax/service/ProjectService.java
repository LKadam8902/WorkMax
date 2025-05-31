package com.example.workmax.service;


import com.example.workmax.entity.Project;
import com.example.workmax.repository.ProjectRepository;
import org.springframework.core.env.PropertyResolverExtensionsKt;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public Iterable<Project> getAllProject(){
        return projectRepository.findAll();
    }

    public Project getProjectById(int projectId){
        return projectRepository.findById(projectId);
    }
}
