package com.code.alpha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.alpha.entity.Attendance;
import com.code.alpha.repository.AttendanceRepo;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceRepo attendanceRepo;

	@Override
	public boolean saveAttendance(Attendance attendance) {
		Attendance savedattendance = attendanceRepo.save(attendance);
		if (savedattendance != null) {
			return true;
		} else {
			return false;
		}

	}

}
