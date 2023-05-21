package com.example.calmdown.repository;

import com.example.calmdown.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {

    Calendar findCalenderByUser_Id(@Param("userID") Long userID);

}
