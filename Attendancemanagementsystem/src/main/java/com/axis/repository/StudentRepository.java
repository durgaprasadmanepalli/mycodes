package com.axis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
