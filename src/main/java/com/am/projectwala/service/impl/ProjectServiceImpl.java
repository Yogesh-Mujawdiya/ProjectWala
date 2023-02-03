package com.am.projectwala.service.impl;

import com.am.projectwala.model.Project;
import com.am.projectwala.repositories.ProjectRepository;
import com.am.projectwala.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProject(){
        return projectRepository.findAll();
    }

    @Override
    public Project updateAndInsertProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project deleteProject(long id) {
        Optional<Project> project = projectRepository.findById(id);
        if (project.isEmpty())
            return null;
        projectRepository.deleteById(id);
        return project.get();
    }

    @Override
    public Project verifyProject(long id, boolean verify) {
        Optional<Project> projectData = projectRepository.findById(id);
        if (projectData.isEmpty())
            return null;
        Project project = projectData.get();
        project.setIsVerified(verify);
        return projectRepository.save(project);
    }
}
