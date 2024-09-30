package com.todo.todo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoProject {
    private Long id;
    private String name;

    private String description;

    //proje oluşturulma tarihi
    private LocalDate createdAt;

    //onetomany mi emin değilim
    private Long userİd;
}
