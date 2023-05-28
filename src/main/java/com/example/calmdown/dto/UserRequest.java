package com.example.calmdown.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class UserRequest {

    private String phoneNum_Value;
    private String em_PhoneNum_Value;
    private String name;
    private Integer age;
    private String sex_Value;

}

