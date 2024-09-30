package com.todo.todo.controller.impl;


import com.todo.todo.controller.IUserController;
import com.todo.todo.dto.DtoUser;
import com.todo.todo.dto.DtoUserIU;
import com.todo.todo.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo/user")
public class UserControllerImpl implements IUserController {
    @Autowired
    private IUserService userService;

    @PostMapping(path = "/save")
    @Override
    public DtoUser saveUser(@RequestBody @Valid DtoUserIU dtoUserIU) {
        return userService.saveUser(dtoUserIU);
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public DtoUser findUserById(@PathVariable(name = "id") Long id) {
        return userService.findUserById(id);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
    }


    @PutMapping(path = "/update/{id}")
    @Override
    public DtoUser updateUser(@PathVariable(name = "id") Long id,@RequestBody @Valid DtoUserIU dtoUserIU) {
        return userService.updateUser(id,dtoUserIU);
    }
}
