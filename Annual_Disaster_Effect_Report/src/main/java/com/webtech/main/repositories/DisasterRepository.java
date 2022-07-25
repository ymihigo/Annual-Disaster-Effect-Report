package com.webtech.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webtech.main.models.Disasterz;

@Repository
public interface DisasterRepository extends JpaRepository<Disasterz, Integer> {

}
