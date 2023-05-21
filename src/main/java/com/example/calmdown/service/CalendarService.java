package com.example.calmdown.service;


import com.example.calmdown.dto.CalendarRequest;
import com.example.calmdown.dto.CalendarResponse;
import com.example.calmdown.entity.Calendar;
import com.example.calmdown.entity.User;
import com.example.calmdown.repository.CalendarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalendarService {

    private final CalendarRepository calendarRepository;

    public void create(CalendarRequest calendarRequest){
        Calendar calendar = new Calendar(
                null, calendarRequest.getTitle(),calendarRequest.getMemo(),
                calendarRequest.getDaytime(),calendarRequest.getSeizure_intensity(),
                new User(calendarRequest.getUser_id())
        );

        calendarRepository.save(calendar);
    }
    public CalendarResponse read(Long userID){

        Calendar calendar = calendarRepository.findCalenderByUser_Id(userID);

        if(calendar == null){
            return null;
        }

        CalendarResponse calendarResponse = new CalendarResponse(
                calendar.getTitle(),
                calendar.getMemo(),
                calendar.getDaytime(),
                calendar.getSeizure_intensity()
        );

        return calendarResponse;
    }
}
