package com.todo.todo.controller;

import com.todo.todo.dto.DtoUser;
import com.todo.todo.dto.DtoUserIU;

import java.util.List;

public interface IUserController {
    public DtoUser saveUser(DtoUserIU dtoUserIU);

    public DtoUser findUserById(Long id);

    public List<DtoUser> getAllUsers();

    public void deleteUser(Long id);

    public DtoUser updateUser(Long id,DtoUserIU dtoUserIU);

}
