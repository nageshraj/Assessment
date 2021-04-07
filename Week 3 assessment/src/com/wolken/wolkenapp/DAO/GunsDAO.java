package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.GunsDTO;

public interface GunsDAO {

	public GunsDTO AddGun(GunsDTO gunsDTO) throws SQLException;

	public void GetAll() throws SQLException;

	public GunsDTO DeleteByGunsId(int gunsIdToBeDeleted) throws SQLException;

	public void UpdateBySerialNumber(String GunNameToUpdate, String gunSerialNumber) throws SQLException;

	public void GetAllByBrandName(String BrandName) throws SQLException;

	public void GetAllByType(String type) throws SQLException;

}
