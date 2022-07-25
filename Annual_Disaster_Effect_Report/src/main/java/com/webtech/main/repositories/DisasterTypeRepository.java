package com.webtech.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webtech.main.models.DisasterType;

@Repository
public interface DisasterTypeRepository extends JpaRepository<DisasterType, Integer> {

	DisasterType findByType(String disasterType);
}
