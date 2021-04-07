package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.GunsDTO;

public interface GunsService {
	
	public GunsDTO validateAndAddGun(GunsDTO gunsDTO) throws SQLException;
	
	public void ValidateAndGetAll() throws SQLException;
	
	public GunsDTO validateAndDeleteByGunsId(int gunsIdToBeDeleted) throws SQLException;
	
	public GunsDTO validateAndUpdateBySerialNumber(String GunNameToUpdate, String gunSerialNumber) throws SQLException;
	
	public void validateAndGetAllByBrandName(String BrandName) throws SQLException;
	
	public void validateAndGetAllByType(String type) throws SQLException;
	
	

}
