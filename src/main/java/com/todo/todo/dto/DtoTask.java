package com.todo.todo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoTask {
    private Long id;

    private String taskTitle;

    private String description;

    //son tarihi
    private LocalDate dueDate;

    //status olacak bi de bitti bitmedi iptal gibisinden

    //düüşün ama onetomany olması lazım
    private Long projectId;

    //onetoone olacak bu
    private Long userId;
}
