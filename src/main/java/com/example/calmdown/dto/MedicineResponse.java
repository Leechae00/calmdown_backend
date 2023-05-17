package com.example.calmdown.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineResponse {
    private int dosing;
    private LocalTime time;
}
