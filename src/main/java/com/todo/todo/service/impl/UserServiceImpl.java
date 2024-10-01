package com.todo.todo.service.impl;

import com.todo.todo.dto.DtoTask;
import com.todo.todo.dto.DtoTaskIU;
import com.todo.todo.dto.DtoUser;
import com.todo.todo.dto.DtoUserIU;
import com.todo.todo.entity.Task;
import com.todo.todo.entity.User;
import com.todo.todo.repository.UserRepository;
import com.todo.todo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public DtoUser saveUser(DtoUserIU dtoUserIU) {
        User user=new User();
        DtoUser response=new DtoUser();
        BeanUtils.copyProperties(dtoUserIU,user);
        User dbUser=userRepository.save(user);
        BeanUtils.copyProperties(dbUser,response);

        return response;
    }

    @Override
    public DtoUser updateUser(Long id, DtoUserIU dtoUserIU) {
        DtoUser dto=new DtoUser();
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            User dbUser=optional.get();
            dbUser.setUserName(dtoUserIU.getUserName());
            dbUser.setEmail(dtoUserIU.getEmail());
            dbUser.setPassword(dtoUserIU.getPassword());
            dbUser.setBirthDate(dtoUserIU.getBirthDate());

            User updatedUser=userRepository.save(dbUser);
            BeanUtils.copyProperties(updatedUser,dto);
            return dto;
        }

        return null;
    }

    @Override
    public DtoUser findUserById(Long id) {

        //27.10bakonetooneda
        DtoUser dtoUser=new DtoUser();
        List<DtoTask>dtoTaskList=new ArrayList<>();
        Optional<User> optional = userRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        User dbUser=optional.get();
        BeanUtils.copyProperties(dbUser,dtoUser);

        List<Task> taskList=optional.get().getUserTasks();
        if (taskList!=null && !taskList.isEmpty()){
            for(Task task:taskList){
                DtoTask dtoTask=new DtoTask();
                BeanUtils.copyProperties(task,dtoTask);
                dtoUser.getUserTasks().add(dtoTask);
            }
        }

        return dtoUser;
    }

    @Override
    public List<DtoUser> getAllUsers() {
        List<DtoUser> dtoList=new ArrayList<>();
        List<User> userList=userRepository.findAll();
        for (User user:userList){
            DtoUser dto=new DtoUser();
            BeanUtils.copyProperties(user,dto);
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public void deleteUser(Long id) {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()){
            userRepository.delete(optional.get());
        }
    }


}
