package com.xworkz.resort;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ServiceDAO;
import com.xworkz.resort.service.ServiceDAOImpl;

public class ResortTester {
	public static void main(String[] args) {
		ResortDAO resortdao=new ResortDAOImpl();
		
		ServiceDAO servicedao=new ServiceDAOImpl(resortdao);
		ResortDTO resortdto=new ResortDTO(1, "oceanpearl", "Hubli", 120, 100);
		servicedao.validateAndsave(resortdto);
		
		
	}

}
