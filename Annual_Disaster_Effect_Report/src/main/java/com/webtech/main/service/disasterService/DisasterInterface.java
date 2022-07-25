package com.webtech.main.service.disasterService;

import java.util.Date;
import java.util.List;

import com.webtech.main.models.Disasterz;

public interface DisasterInterface {
 Disasterz createDisaster(int deaths, int injured, int missing, int houseDemaged, int cropsDemaged, int liveStock,
			int schools, int roads, int bridges, String province, String district, String sector, String village,
			int type, Date from, Date to);
 
 List<Disasterz> getAllDisaster();
}
