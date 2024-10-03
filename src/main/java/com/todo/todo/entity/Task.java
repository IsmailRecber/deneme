package com.todo.todo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskTitle;

    private String description;

    //son tarihi
    private LocalDate dueDate;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
    //status olacak bi de bitti bitmedi iptal gibisinden

}
