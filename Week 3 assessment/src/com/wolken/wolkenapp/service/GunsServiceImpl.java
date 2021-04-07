package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.GunsDAO;
import com.wolken.wolkenapp.DAO.GunsDAOImpl;
import com.wolken.wolkenapp.DTO.GunsDTO;

public class GunsServiceImpl implements GunsService{

	GunsDAO gunsDAO =  new GunsDAOImpl(); 
	GunsDTO gunsDTO = new GunsDTO(); 
	
	@Override
	public GunsDTO validateAndAddGun(GunsDTO gunsDTO) throws SQLException {
		// TODO Auto-generated method stub
		if(gunsDTO.getGunsId()>0) {
			gunsDAO.AddGun(gunsDTO);
			return gunsDTO;
		}
			
		return null;
	}

	@Override
	public void ValidateAndGetAll() throws SQLException {
		// TODO Auto-generated method stub
		gunsDAO.GetAll();
		
	}

	@Override
	public GunsDTO validateAndDeleteByGunsId(int gunsIdToBeDeleted) throws SQLException {
		// TODO Auto-generated method stub
		if(gunsIdToBeDeleted> 0) {
			gunsDAO.DeleteByGunsId(gunsIdToBeDeleted);
			return gunsDTO;

		}
		return null;
	}

	@Override
	public GunsDTO validateAndUpdateBySerialNumber(String GunNameToUpdate, String gunSerialNumber) throws SQLException {
		// TODO Auto-generated method stub
		if(GunNameToUpdate!=null) {
			gunsDAO.UpdateBySerialNumber(GunNameToUpdate, gunSerialNumber);
			return gunsDTO;

		}
		return null;
	}

	@Override
	public void validateAndGetAllByBrandName(String BrandName) throws SQLException {
		// TODO Auto-generated method stub
		if(BrandName!= null) {
			gunsDAO.GetAllByBrandName(BrandName);
			

		}
		
	}

	@Override
	public void validateAndGetAllByType(String type) throws SQLException {
		// TODO Auto-generated method stub
		if(type!=null)
		gunsDAO.GetAllByType(type);
		
	}

}
