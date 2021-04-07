package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;

public interface MobileDAO {
	public boolean addMobile(MobileDTO mobileDTO);
	
	public void getAll();
	
	public MobileDTO deleteMobileByMobileId(int mobileId);
	
	public void updateMemoryBySerialNumber(String serialNumber, double memory);
	
	public void getAllByBrandName(String brandName) throws MobileException;

}
