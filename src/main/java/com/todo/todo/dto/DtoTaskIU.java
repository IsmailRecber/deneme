package com.todo.todo.dto;

import com.todo.todo.entity.User;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoTaskIU {

    @NotEmpty(message = "Task basşlığı boş bırakılamaz!")
    private String taskTitle;

    @NotEmpty(message = "Task açıklaması boş bırakılamaz!")
    private String description;

    //sontarihi
    @NotEmpty(message = "Son tarih kısmı boş bırakılamaz!")
    private LocalDate dueDate;

    @NotEmpty(message = "User Id boş bırakılamaz")
    private Long userId;
    //status olacak bi de bitti bitmedi iptal gibisinden

}
