package com.code.alpha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.alpha.entity.Attendance;
import com.code.alpha.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AddendanceController {

	@Autowired
	private AttendanceService attendanceService;

	@PostMapping("/save")
	public ResponseEntity<String> markAttendance(@RequestBody Attendance attendance) {
		boolean saveAttendance = attendanceService.saveAttendance(attendance);
		if (saveAttendance) {
			return new ResponseEntity<>("saved", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("not saved", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
