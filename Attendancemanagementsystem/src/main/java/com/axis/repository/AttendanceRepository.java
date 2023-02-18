package com.axis.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.model.Attendance;

public interface AttendanceRepository extends MongoRepository<Attendance, String> {
    List<Attendance> findByStudentIdAndDateBetween(String studentId, Date startDate, Date endDate);
}
