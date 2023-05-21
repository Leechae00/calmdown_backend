package com.example.calmdown.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class CalendarRequest {

    private String title;

    private String memo;

    private LocalDate daytime;

    //발작강도 기록
    private int seizure_intensity;

    private Long user_id;
}
