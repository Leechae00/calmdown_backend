package com.example.calmdown.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Getter
@NoArgsConstructor
public class MedicineRequest {

    private int dosing;
    private LocalTime time;
    private Long user_id;
}
