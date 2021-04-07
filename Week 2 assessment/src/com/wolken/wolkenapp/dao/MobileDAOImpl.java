package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.exception.*;

public class MobileDAOImpl implements MobileDAO {
	public MobileDTO[] mobileDTO;
	int i = 0;

	public MobileDAOImpl(int size) {
		mobileDTO = new MobileDTO[size];
	}

	@Override
	public boolean addMobile(MobileDTO mobileDTO) {

		if (mobileDTO != null) {
			this.mobileDTO[i++] = mobileDTO;
			return true;
		} else
			return false;
	}

	@Override
	public void getAll() {
		for (int i = 0; i < mobileDTO.length; i++) {
			try {
				System.out.println("Brand Name: " + mobileDTO[i].getBrandName() + "\nMemory: "
						+ mobileDTO[i].getMemory() + "\nMobile ID: " + mobileDTO[i].getMobileId() + "\nModel Name: "
						+ mobileDTO[i].getModelName() + "\nNumber of Camera: " + mobileDTO[i].getNumberOfCamera()
						+ "\nPrice: " + mobileDTO[i].getPrice() + "\nSerial Number: " + mobileDTO[i].getSerialNumber()
						+ "\n");
			} catch (NullPointerException n) {
				System.out.println("Caught null value while trying to display" + n);
			}
		}
	}

	@Override
	public MobileDTO deleteMobileByMobileId(int mobileId) {
		MobileDTO found;
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getMobileId() == mobileId) {
					found = this.mobileDTO[i];
					this.mobileDTO[i] = null;
					System.out.println("\nMobile successfully deleted");
					return found;

				} 
			} else {
				System.out.println("Mobile ID could not be found");
				return null;

			}
		}
	//	System.out.println("Mobile ID could not be found");
		return null;
	}

	@Override
	public void updateMemoryBySerialNumber(String serialNumber, double memory) {
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getSerialNumber().equalsIgnoreCase(serialNumber)) {
					this.mobileDTO[i].setMemory(memory);
					System.out.println("\nMemory successfully updated");

				} else
					System.out.println("\nSerial number of Mobile not found");

			}
		}
	}

	@Override
	public void getAllByBrandName(String brandName) throws MobileException {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.mobileDTO.length; i++) {
			if (this.mobileDTO[i] != null) {
				if (this.mobileDTO[i].getBrandName().equalsIgnoreCase(brandName)) {
					System.out.println("Brand Name: " + mobileDTO[i].getBrandName() + "\nMemory: "
							+ mobileDTO[i].getMemory() + "\nMobile ID: " + mobileDTO[i].getMobileId() + "\nModel Name: "
							+ mobileDTO[i].getModelName() + "\nNumber of Camera: " + mobileDTO[i].getNumberOfCamera()
							+ "\nPrice: " + mobileDTO[i].getPrice() + "\nSerial Number: "
							+ mobileDTO[i].getSerialNumber() + "\n");

				} else {
					// System.out.println("You have entered a brand which does not exist");
					throw new MobileException();

				}
			}

		}
		
	}

	
		
	}


