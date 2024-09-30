package com.todo.todo.service;

import com.todo.todo.dto.DtoProject;

import java.util.List;

public interface IProjectService {

    public DtoProject saveTask();

    public List<DtoProject> getAllProjects();

    public DtoProject getProjectById(Long id);

    public DtoProject updateProject(Long id);

    public void deleteProject(Long id);
}
