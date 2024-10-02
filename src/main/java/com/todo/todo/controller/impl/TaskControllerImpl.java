package com.todo.todo.controller.impl;

import com.todo.todo.controller.ITaskController;
import com.todo.todo.dto.DtoTask;
import com.todo.todo.dto.DtoTaskIU;
import com.todo.todo.entity.Task;
import com.todo.todo.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/task")

public class TaskControllerImpl implements ITaskController {
    @Autowired
    private ITaskService taskService;

    @PostMapping(path = "/save")
    @Override
    public DtoTask saveTask(@RequestBody DtoTaskIU dtoTask) {
        return taskService.saveTask(dtoTask);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoTask> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoTask getTaskById(@PathVariable(name = "id") Long id) {
        return taskService.getTaskById(id);
    }


    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteTask(@PathVariable(name = "id") Long id) {
        taskService.deleteTask(id);
    }

    @PutMapping("/save/{id}")
    @Override
    public DtoTask updateTask(@PathVariable(name = "id") Long id) {
        return taskService.updateTask(id);
    }
}
