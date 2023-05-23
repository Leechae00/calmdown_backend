package com.example.calmdown.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String phoneNum_Value;
    private String EM_PhoneNum_Value;
    private String name;
    private Integer age;
    private String sex_Value;
    private String login_id;
    private String login_password;
    private LocalDate birth;
}
