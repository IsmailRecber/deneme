package com.todo.todo.controller.impl;

import com.todo.todo.controller.IProjectController;
import com.todo.todo.dto.DtoProject;
import com.todo.todo.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/project")

public class ProjectControllerImpl implements IProjectController {
    @Autowired
    private IProjectService projectService;

    @PostMapping("/save")
    @Override
    public DtoProject saveTask() {
        return projectService.saveTask();
    }

    @GetMapping("/list")
    @Override
    public List<DtoProject> getAllProjects() {
        return projectService.getAllProjects();
    }


    @GetMapping("/list/{id}")
    @Override
    public DtoProject getProjectById(@PathVariable(name = "id") Long id) {
        return projectService.getProjectById(id);
    }


    @PutMapping("/update/{id}")
    @Override
    public DtoProject updateProject(@PathVariable(name = "id") Long id) {
        return null;
    }

    @DeleteMapping
    @Override
    public void deleteProject(Long id) {
        projectService.deleteProject(id);
    }
}
