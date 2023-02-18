package com.axis.controller;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.Attendance;
import com.axis.service.AttendanceService;

@RestController
public class AdminController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("/viewAttendance")
    public ResponseEntity<List<Attendance>> viewAttendance(@RequestParam String studentId,
            @RequestParam @DateTimeFormat(iso = ISO.DATE) Date startDate,
            @RequestParam @DateTimeFormat(iso = ISO.DATE) Date endDate) {
        List<Attendance> attendance = attendanceService.getAttendance(studentId, startDate, endDate);
        return ResponseEntity.ok(attendance);
    }

}

