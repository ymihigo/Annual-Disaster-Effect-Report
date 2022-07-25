package com.webtech.main.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Disasterz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int deaths;
	private int injured;
	private int missing;
	private int houseDemaged;
	private int cropsDemaged;
	private int liveStock;
	private int schools;
	private int roads;
	private int bridges;
	private String province;
	private String district;
	private String sector;
	private String village;
	@ManyToOne
	private DisasterType type;
	@Temporal(TemporalType.DATE)
//	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private Date from;
	@Temporal(TemporalType.DATE)
//	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private Date to;

	public Disasterz() {
		super();
	}

	public Disasterz(int id, int deaths, int injured, int missing, int houseDemaged, int cropsDemaged, int liveStock,
			int schools, int roads, int bridges, String province, String district, String sector, String village,
			DisasterType type, Date from, Date to) {
		this.id = id;
		this.deaths = deaths;
		this.injured = injured;
		this.missing = missing;
		this.houseDemaged = houseDemaged;
		this.cropsDemaged = cropsDemaged;
		this.liveStock = liveStock;
		this.schools = schools;
		this.roads = roads;
		this.bridges = bridges;
		this.province = province;
		this.district = district;
		this.sector = sector;
		this.village = village;
		this.type = type;
		this.from = from;
		this.to = to;
	}

	public Disasterz(int deaths, int injured, int missing, int houseDemaged, int cropsDemaged, int liveStock,
			int schools, int roads, int bridges, String province, String district, String sector, String village,
			DisasterType type, Date from, Date to) {
		this.deaths = deaths;
		this.injured = injured;
		this.missing = missing;
		this.houseDemaged = houseDemaged;
		this.cropsDemaged = cropsDemaged;
		this.liveStock = liveStock;
		this.schools = schools;
		this.roads = roads;
		this.bridges = bridges;
		this.province = province;
		this.district = district;
		this.sector = sector;
		this.village = village;
		this.type = type;
		this.from = from;
		this.to = to;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getInjured() {
		return injured;
	}

	public void setInjured(int injured) {
		this.injured = injured;
	}

	public int getMissing() {
		return missing;
	}

	public void setMissing(int missing) {
		this.missing = missing;
	}

	public int getHouseDemaged() {
		return houseDemaged;
	}

	public void setHouseDemaged(int houseDemaged) {
		this.houseDemaged = houseDemaged;
	}

	public int getCropsDemaged() {
		return cropsDemaged;
	}

	public void setCropsDemaged(int cropsDemaged) {
		this.cropsDemaged = cropsDemaged;
	}

	public int getLiveStock() {
		return liveStock;
	}

	public void setLiveStock(int liveStock) {
		this.liveStock = liveStock;
	}

	public int getSchools() {
		return schools;
	}

	public void setSchools(int schools) {
		this.schools = schools;
	}

	public int getRoads() {
		return roads;
	}

	public void setRoads(int roads) {
		this.roads = roads;
	}

	public int getBridges() {
		return bridges;
	}

	public void setBridges(int bridges) {
		this.bridges = bridges;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public DisasterType getType() {
		return type;
	}

	public void setType(DisasterType type) {
		this.type = type;
	}

	public Date getFrom() {
		return from;
	}

	public void setFrom(Date from) {
		this.from = from;
	}

	public Date getTo() {
		return to;
	}

	public void setTo(Date to) {
		this.to = to;
	}
}
