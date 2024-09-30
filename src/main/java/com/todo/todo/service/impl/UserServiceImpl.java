package com.todo.todo.service.impl;

import com.todo.todo.dto.DtoUser;
import com.todo.todo.dto.DtoUserIU;
import com.todo.todo.entity.User;
import com.todo.todo.repository.UserRepository;
import com.todo.todo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return null;
    }

    @Override
    public DtoUser findUserById(Long id) {
        return null;
    }

    @Override
    public List<DtoUser> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }


}
