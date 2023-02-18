package com.axis.service;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Attendance;
import com.axis.repository.AttendanceRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public void markAttendance(String studentId, Date date, boolean present) {
        Attendance attendance = new Attendance(studentId, date, present);
        attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAttendance(String studentId, Date startDate, Date endDate) {
        return attendanceRepository.findByStudentIdAndDateBetween(studentId, startDate, endDate);
    }

}

