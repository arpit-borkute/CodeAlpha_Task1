package com.code.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.alpha.entity.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer> {

	


}
