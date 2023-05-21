package com.example.calmdown.dto;


import com.example.calmdown.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CalendarResponse {

    private String title;

    private String memo;

    private LocalDate daytime;

    //발작강도 기록
    private int seizure_intensity;

}
