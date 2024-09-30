package com.todo.todo.controller;

import com.todo.todo.dto.DtoProject;

import java.util.List;

public interface IProjectController {
    public DtoProject saveTask();

    public List<DtoProject> getAllProjects();

    public DtoProject getProjectById(Long id);

    public DtoProject updateProject(Long id);

    public void deleteProject(Long id);
}
