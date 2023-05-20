package com.example.calmdown.controller;

import com.example.calmdown.dto.MedicineRequest;
import com.example.calmdown.dto.MedicineResponse;
import com.example.calmdown.dto.UserResponse;
import com.example.calmdown.service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MedicineApiController {

    private final MedicineService medicineService;

    @PostMapping("/medicine")
    public ResponseEntity<MedicineResponse> create(@RequestBody MedicineRequest medicineRequest) {
        medicineService.create(medicineRequest);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping("/medicine")
    public ResponseEntity<MedicineResponse> read(@RequestParam Long userID){
        MedicineResponse medicineResponse = medicineService.read(userID);
        return (medicineResponse != null)?
                ResponseEntity.status(HttpStatus.OK).body(medicineResponse):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

    }
}
