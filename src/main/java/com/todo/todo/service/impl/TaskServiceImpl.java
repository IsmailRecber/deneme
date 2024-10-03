package com.todo.todo.service.impl;

import com.todo.todo.dto.DtoTask;
import com.todo.todo.dto.DtoTaskIU;
import com.todo.todo.dto.DtoUser;
import com.todo.todo.entity.Task;
import com.todo.todo.entity.User;
import com.todo.todo.repository.TaskRepository;
import com.todo.todo.repository.UserRepository;
import com.todo.todo.service.ITaskService;
import com.todo.todo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private IUserService userService;

    @Override
    public DtoTask saveTask(DtoTaskIU dtoTask) {
        Long userId=dtoTask.getUserId();
        Task task=new Task();

        DtoTask response=new DtoTask();
        BeanUtils.copyProperties(dtoTask,task);

        Task dbTask=taskRepository.save(task);
        BeanUtils.copyProperties(dbTask,response);
        userService.addTaskToUser(userId,response);

        return response;
    }

    @Override
    public List<DtoTask> getAllTasks() {
        List<Task> taskList=taskRepository.findAll();
        List<DtoTask> dtoTaskList=new ArrayList<>();

        for (Task task:taskList){
            DtoTask dtoTask=new DtoTask();
            BeanUtils.copyProperties(task,dtoTask);
            dtoTaskList.add(dtoTask);
        }


        return dtoTaskList;
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
