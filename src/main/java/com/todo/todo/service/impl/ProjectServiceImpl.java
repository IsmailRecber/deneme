package com.todo.todo.service.impl;

import com.todo.todo.dto.DtoProject;
import com.todo.todo.entity.Project;
import com.todo.todo.repository.ProjectRepository;
import com.todo.todo.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {
   @Autowired
   private ProjectRepository projectRepository;

    @Override
    public DtoProject saveTask() {
        return null;
    }

    @Override
    public List<DtoProject> getAllProjects() {
        return null;
    }

    @Override
    public DtoProject getProjectById(Long id) {
        return null;
    }

    @Override
    public DtoProject updateProject(Long id) {
        return null;
    }

    @Override
    public void deleteProject(Long id) {

    }
}
