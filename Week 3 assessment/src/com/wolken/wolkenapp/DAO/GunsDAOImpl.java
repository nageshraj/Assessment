package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.DTO.GunsDTO;

public class GunsDAOImpl implements GunsDAO {

	public Connection con = Connect.getConnection();

	@Override
	public GunsDTO AddGun(GunsDTO gunsDTO) throws SQLException {
		// TODO Auto-generated method stub

		try (PreparedStatement preparedStatement = con
				.prepareStatement("insert into wolken.guns_table values(?,?,?,?,?,?,?,?)");) {

			preparedStatement.setInt(1, gunsDTO.getGunsId());
			preparedStatement.setString(2, gunsDTO.getGunName());
			preparedStatement.setDouble(3, gunsDTO.getGunPrice());
			preparedStatement.setString(4, gunsDTO.getGunSerialNumber());
			preparedStatement.setString(5, gunsDTO.getGunBrandName());
			preparedStatement.setString(6, gunsDTO.getGunType());
			preparedStatement.setInt(7, gunsDTO.getGunNoOfBullets());
			preparedStatement.setString(8, gunsDTO.getGunMadeIn());

			preparedStatement.executeUpdate();

			preparedStatement.close();
		}

		return gunsDTO;
	}

	@Override
	public void GetAll() throws SQLException {
		// TODO Auto-generated method stub

		try (PreparedStatement preparedStatement = con.prepareStatement("select * from wolken.guns_table")) {
			try (ResultSet rs = preparedStatement.executeQuery();) {

				while (rs.next()) {
					int gunsId = rs.getInt(1);
					String gunsName = rs.getString(2);
					double gunsPrice = rs.getDouble(3);
					String gunSerialNumber = rs.getString(4);
					String gunBrand = rs.getString(5);
					String gunType = rs.getString(6);
					int gunNoOfBullets = rs.getInt(7);
					String gunMadeIn = rs.getString(8);

					System.out.println(gunsId + " " + gunsName + " " + gunsPrice + " " + gunSerialNumber + " "
							+ gunBrand + " " + gunType + " " + gunNoOfBullets + " " + gunMadeIn);
				}

			}

		}

	}

	@Override
	public GunsDTO DeleteByGunsId(int gunsIdToBeDeleted) throws SQLException {
		// TODO Auto-generated method stub
		
		try (PreparedStatement preparedStatement = con
				.prepareStatement("delete from wolken.guns_table where prisonId = ? ");) {
			preparedStatement.setInt(1, gunsIdToBeDeleted);
			return gunsDTO;
		}

	}

	@Override
	public void UpdateBySerialNumber(String GunNameToUpdate, String gunSerialNumber) throws SQLException {

		try (PreparedStatement preparedStatement = con
				.prepareStatement("update wolken.guns_table set gunName = ? " + "where gunSerial = ?; ");) {

			preparedStatement.setString(1, GunNameToUpdate);
			preparedStatement.setString(2, gunSerialNumber);

			int noOfRowsAffected = preparedStatement.executeUpdate();

			if (noOfRowsAffected > 0) {
				System.out.println("Successfully updated");
				
			}
	}
	}

	@Override
	public void GetAllByBrandName(String BrandName) throws SQLException {
		// TODO Auto-generated method stub
		
		try (PreparedStatement preparedStatement = con.prepareStatement("select * from wolken.guns_table where gunBrand = ?")) {
			preparedStatement.setString(1,BrandName);
			try (ResultSet rs = preparedStatement.executeQuery();) {

				while (rs.next()) {
					int gunsId = rs.getInt(1);
					String gunsName = rs.getString(2);
					double gunsPrice = rs.getDouble(3);
					String gunSerialNumber = rs.getString(4);
					String gunBrand = rs.getString(5);
					String gunType = rs.getString(6);
					int gunNoOfBullets = rs.getInt(7);
					String gunMadeIn = rs.getString(8);

					System.out.println(gunsId + " " + gunsName + " " + gunsPrice + " " + gunSerialNumber + " "
							+ gunBrand + " " + gunType + " " + gunNoOfBullets + " " + gunMadeIn);
				}

			}

	}
	}

	@Override
	public void GetAllByType(String type) throws SQLException {
		// TODO Auto-generated method stub
		
		try (PreparedStatement preparedStatement = con.prepareStatement("select * from wolken.guns_table where gunType = ?")) {
			preparedStatement.setString(1,type);
			try (ResultSet rs = preparedStatement.executeQuery();) {

				while (rs.next()) {
					int gunsId = rs.getInt(1);
					String gunsName = rs.getString(2);
					double gunsPrice = rs.getDouble(3);
					String gunSerialNumber = rs.getString(4);
					String gunBrand = rs.getString(5);
					String gunType = rs.getString(6);
					int gunNoOfBullets = rs.getInt(7);
					String gunMadeIn = rs.getString(8);

					System.out.println(gunsId + " " + gunsName + " " + gunsPrice + " " + gunSerialNumber + " "
							+ gunBrand + " " + gunType + " " + gunNoOfBullets + " " + gunMadeIn);
				}

			}

	}

	}

}
