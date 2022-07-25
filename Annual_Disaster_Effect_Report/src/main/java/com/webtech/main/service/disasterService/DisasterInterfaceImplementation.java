package com.webtech.main.service.disasterService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtech.main.models.Disasterz;
import com.webtech.main.models.DisasterType;
import com.webtech.main.repositories.DisasterRepository;
import com.webtech.main.repositories.DisasterTypeRepository;


@Service
public class DisasterInterfaceImplementation implements DisasterInterface {

	@Autowired
	private DisasterRepository disaster_repo;
	private DisasterTypeRepository di_type_repo;

	@Override
	public Disasterz createDisaster(int deaths, int injured, int missing, int houseDemaged, int cropsDemaged,
			int liveStock, int schools, int roads, int bridges, String province, String district, String sector,
			String village, int type, Date from, Date to) {
		try {

			Optional<DisasterType> dt = di_type_repo.findById(type);

			if (dt.isEmpty()) {
				throw new RuntimeException("Invalid disaster type");
			}

			return disaster_repo.saveAndFlush(new Disasterz(deaths, injured, missing, houseDemaged, cropsDemaged,
					liveStock, schools, roads, bridges, province, district, sector, village, dt.get(), from, to));
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public List<Disasterz> getAllDisaster() {
		try {
			return disaster_repo.findAll();
		} catch (Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

}
