package com.todo.todo.service.impl;

import com.todo.todo.dto.DtoTask;
import com.todo.todo.entity.Task;
import com.todo.todo.repository.TaskRepository;
import com.todo.todo.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public DtoTask saveTask() {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public DtoTask getTaskById(Long id) {
        return null;
    }

    @Override
    public void deleteTask(Long id) {

    }

    @Override
    public DtoTask updateTask(Long id) {
        return null;
    }
}
