package com.example.calmdown.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
public class MedicineRequest {

    private int dosing;
    private LocalTime time;
}
