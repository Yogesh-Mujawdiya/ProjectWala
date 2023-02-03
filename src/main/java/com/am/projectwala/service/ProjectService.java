package com.am.projectwala.service;

import com.am.projectwala.model.Project;

import java.util.List;


public interface ProjectService {

    List<Project> getAllProject();

    Project updateAndInsertProject(Project project);

    Project deleteProject(long id);

    Project verifyProject(long id, boolean verify);

}
