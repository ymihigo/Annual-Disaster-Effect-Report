package com.webtech.main.service.disasterTypeService;

import java.util.List;

import com.webtech.main.models.DisasterType;

public interface DisasterTypeService {
	
	DisasterType createDisasterType(String disasterType);

	List<DisasterType> getAllDisterType();
}
