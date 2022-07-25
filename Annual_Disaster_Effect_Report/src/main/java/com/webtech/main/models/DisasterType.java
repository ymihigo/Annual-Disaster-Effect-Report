package com.webtech.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DisasterType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;

	public DisasterType() {
		super();
	}

	public DisasterType(int id, String type) {
		this.id = id;
		this.type = type;
	}

	public DisasterType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
