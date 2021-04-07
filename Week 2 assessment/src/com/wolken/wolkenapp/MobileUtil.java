package com.wolken.wolkenapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.wolken.wolkenapp.dao.MobileDAOImpl;
import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.MobileException;
import com.wolken.wolkenapp.service.MobileService;
import com.wolken.wolkenapp.service.MobileServiceImpl;

public class MobileUtil {
	public static void main(String[] args) throws MobileException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		MobileDAOImpl mobile = new MobileDAOImpl(size);

		for (int i = 0; i < size; i++) {
			try {
			System.out.println("Enter Brand Name: ");
			String brandName = sc.next();

			System.out.println("Enter Memory: ");
			double memory = sc.nextDouble();

			System.out.println("Enter Mobile ID: ");
			int mobileId = sc.nextInt();

			System.out.println("Enter Model Name: ");
			String modelName = sc.next();

			System.out.println("Enter Number of Camera: ");
			int numberOfCamera = sc.nextInt();

			System.out.println("Enter Price: ");
			double price = sc.nextDouble();

			System.out.println("Enter Serial Number: ");
			String serialNumber = sc.next();
			
			MobileDTO mobileDTO = new MobileDTO();
			
			mobileDTO.setBrandName(brandName);
			mobileDTO.setMemory(memory);
			mobileDTO.setMobileId(mobileId);
			mobileDTO.setModelName(modelName);
			mobileDTO.setNumberOfCamera(numberOfCamera);
			mobileDTO.setPrice(price);
			mobileDTO.setSerialNumber(serialNumber);
			
			MobileService mobileService =  new MobileServiceImpl();
			boolean isValid=mobileService.validate(mobileDTO);
			if(isValid) {
				if (mobile.addMobile(mobileDTO))
					System.out.println("\nMobile details successfully added");
				else
					System.out.println("\nMobile details could not be added due to NULL values");
				
			}
			else {
				System.out.println("The given details could not be validated");
			}

			
			}
			catch(InputMismatchException inputmismatch) {
				System.out.println("Caught Input mismatch exception "+inputmismatch);
			}
			

		
		}

		mobile.getAll();

		// deletion
		System.out.println("Do you want to delete anything by Id? y/n");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("\n Enter the Id of the mobile to be deleted");
			int idToBeSearced = sc.nextInt();
			MobileDTO mobileDTO=mobile.deleteMobileByMobileId(idToBeSearced);
			
			if(mobileDTO==null) {
				System.out.println("Mobile Id does not exist");
			}
			System.out.println("\nThe list after deletion operation is: \n ");
			mobile.getAll();
			
		} else {
			// updation
			System.out.println("Do you want to update anything by Serial Number? y/n");
			String answer1 = sc.next();
			if (answer1.equalsIgnoreCase("y")) {
				System.out.println("Enter the Serial Number of mobile to be updated: ");
				String serialNumberToBeUpdated = sc.next();
				System.out.println("Enter the new memory of mobile");
				double memoryToBeUpdated = sc.nextDouble();

				mobile.updateMemoryBySerialNumber(serialNumberToBeUpdated, memoryToBeUpdated);
				mobile.getAll();

			} else {
				// display by brand name
				System.out.println("Enter brand name of mobiles you want to display: ");
				String brandNameToGetAll = sc.next();
				mobile.getAllByBrandName(brandNameToGetAll);

			}

		}
		sc.close();
		
	}
	

}
