package com.pkk.spring_boot_validation.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    @NotNull(message = "Name is required..!")
    private String name;
    @NotNull(message = "Email is required..!")
    @Email(message = "wrong formatting.!")
    private String email;
}
