package com.example.calmdown.controller;

import com.example.calmdown.dto.CalendarRequest;
import com.example.calmdown.dto.CalendarResponse;
import com.example.calmdown.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CalendarApiController {

    private final CalendarService calendarService;

    @PostMapping("/calendar")
    public ResponseEntity<?> create(@RequestBody CalendarRequest calendarRequest){
        calendarService.create(calendarRequest);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }

    @GetMapping("/calendar")
    public ResponseEntity<CalendarResponse> read(@RequestParam Long userID){
        CalendarResponse calendarResponse = calendarService.read(userID);
        return (calendarResponse != null) ?
                ResponseEntity.status(HttpStatus.OK).body(calendarResponse):
                ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
