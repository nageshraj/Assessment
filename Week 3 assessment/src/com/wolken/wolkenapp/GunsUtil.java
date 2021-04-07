package com.wolken.wolkenapp;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.GunsDTO;
import com.wolken.wolkenapp.service.GunsService;
import com.wolken.wolkenapp.service.GunsServiceImpl;

public class GunsUtil {

	public static void main(String[] args) throws SQLException {
		GunsDTO gunsDTO = new GunsDTO();
		GunsService gunsService = new GunsServiceImpl();

		gunsDTO.setGunsId(7);
		gunsDTO.setGunName("M249");
		gunsDTO.setGunBrandName("boston");
		gunsDTO.setGunMadeIn("China");
		gunsDTO.setGunNoOfBullets(170);
		gunsDTO.setGunPrice(5600);
		gunsDTO.setGunSerialNumber("m201");
		gunsDTO.setGunType("MG");
		// Adding
		try {
			if (gunsService.validateAndAddGun(gunsDTO)!=null)
				System.out.println("Gun Added");
			else
				System.out.println("gun not added");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Print all

		System.out.println("\nPrinting all data : ");
		try {
			gunsService.ValidateAndGetAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Delete by Id
		System.out.println("\nDeleting by Gun ID: ");
		try {
			gunsService.validateAndDeleteByGunsId(3);
			gunsService.ValidateAndGetAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Update by serial no
		try {
			gunsService.validateAndUpdateBySerialNumber("\nNEGEV", "m201");
			gunsService.ValidateAndGetAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Get by Brand
		try {
			gunsService.validateAndGetAllByBrandName("Khalils");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		// Get by type
		try {
			gunsService.validateAndGetAllByType("rifle");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
