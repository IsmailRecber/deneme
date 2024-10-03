package com.todo.todo.dto;

import com.todo.todo.entity.User;
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

    private Long userId;
    //bitti bitmediyi enumla da yapabiliriz bunabir bak
    //private boolean isComplete;

    //status olacak bi de bitti bitmedi iptal gibisinden

}
