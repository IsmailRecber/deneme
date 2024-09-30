package com.todo.todo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUser {
    private Long id;

    private String userName;

    private String password;

    private String email;

    private LocalDate birthDate;
}
