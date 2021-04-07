package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.MobileDTO;

public class MobileServiceImpl implements MobileService {

	@Override
	public boolean validate(MobileDTO mobileDTO) {
		// TODO Auto-generated method stub
		
		boolean check=false;
		
		if(mobileDTO.getPrice() <=0 || mobileDTO.getPrice() >= 100000) {
				System.out.println("Invalid price");
				check=false;
				return check;
				
		}
		else {
			if(mobileDTO.getMemory() % 2 != 0) {
				check=false;
				
			System.out.println("Invalid memory, it must be multiple of 2");
			return check;
			}
			
			else check=true;
			
			return check;
		}
	}
}
		
	
