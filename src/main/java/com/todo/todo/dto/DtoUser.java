package com.todo.todo.dto;


import com.todo.todo.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUser {
    private Long id;

    private String userName;

    private String password;

    private String email;

    private LocalDate birthDate;

    private List<DtoTask> userTasks=new ArrayList<>();
}
