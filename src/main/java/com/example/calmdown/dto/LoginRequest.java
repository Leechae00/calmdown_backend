package com.example.calmdown.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class LoginRequest {

    private String phone;
    private String emergency_phone;
    private String gender;
    private String login_id;
    private String login_password;
    private LocalDate birth;
}
