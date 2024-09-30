package com.todo.todo.service;

import com.todo.todo.dto.DtoTask;
import com.todo.todo.entity.Task;

import java.util.List;

public interface ITaskService {

    public DtoTask saveTask();

    public List<Task> getAllTasks();

    public DtoTask getTaskById(Long id);

    public void deleteTask(Long id);

    public DtoTask updateTask(Long id);


}
