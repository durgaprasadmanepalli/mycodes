package com.axis.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axis.service.AttendanceService;

@RestController
public class FacultyController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/markAttendance")
    public ResponseEntity<String> markAttendance(@RequestParam String studentId,
            @RequestParam @DateTimeFormat(iso = ISO.DATE) Date date, @RequestParam boolean present) {
    	attendanceService.markAttendance(studentId, date, present);
    	return ResponseEntity.ok("Attendance marked successfully.");
    	}

    	}
