package com.webtech.main.service.disasterTypeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtech.main.models.DisasterType;
import com.webtech.main.repositories.DisasterTypeRepository;

@Service
public class DisasterTypeInterfaceImplementation implements DisasterTypeService {

	@Autowired
	private DisasterTypeRepository disasterTypeRepo;

	@Override
	public DisasterType createDisasterType(String disasterType) {
		try {
			if (disasterType.isBlank()) {
				throw new RuntimeException("disaster type can not be null");
			}

			DisasterType dt = disasterTypeRepo.findByType(disasterType);
			if (dt != null) {
				throw new RuntimeException("Disasterz type already exist");
			}

			return disasterTypeRepo.saveAndFlush(new DisasterType(disasterType));
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public List<DisasterType> getAllDisterType() {
		try {
			return disasterTypeRepo.findAll();
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
