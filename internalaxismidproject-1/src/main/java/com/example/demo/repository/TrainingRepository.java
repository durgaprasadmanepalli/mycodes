package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Training;
@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {
	

}
