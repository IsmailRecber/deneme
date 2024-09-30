package com.todo.todo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoUserIU {

    @Size(min = 3,max =12,message = "Kullanıcı adı 3-12 karakter arasında olmalıdır!")
    @NotEmpty(message = "Kullanıcı adı alanı boş bırakılamaz!" )
    private String userName;

    @Size(min = 5,max = 12,message = "Şifrenizi 5-12 karakter arası girin!")
    @NotEmpty(message ="Şifre alanı boş bırakılamaz!")
    private String password;

    @Email(message = "Geçerli bir e-mail girin!")
    private String email;

    private LocalDate birthDate;

}
