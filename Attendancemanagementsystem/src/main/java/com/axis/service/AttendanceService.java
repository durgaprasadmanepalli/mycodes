package com.axis.service;


import java.util.Date;
import java.util.List;

import com.axis.model.Attendance;

public interface AttendanceService {
    void markAttendance(String studentId, Date date, boolean present);
    List<Attendance> getAttendance(String studentId, Date startDate, Date endDate);
}
