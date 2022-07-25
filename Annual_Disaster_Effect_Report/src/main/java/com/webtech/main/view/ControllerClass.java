package com.webtech.main.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webtech.main.service.disasterTypeService.DisasterTypeService;

@Controller
public class ControllerClass {

	@Autowired
	private DisasterTypeService disaster_type;

	@PostMapping("/newDisasterType")
	public ResponseEntity<?> createDisasterType(@RequestParam("type") String type) {
		try {
			return ResponseEntity.ok().body(disaster_type.createDisasterType(type));
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@GetMapping("AllDisastertype")
	public ResponseEntity<?> getAllDisasterType() {
		try {
			return ResponseEntity.ok().body(disaster_type.getAllDisterType());
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}
