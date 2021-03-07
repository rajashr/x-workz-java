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
		ResortDTO resortdto=new ResortDTO(26, "ParadiseInn", "Goa", 135, 120);
		servicedao.validateAndsave(resortdto);
		servicedao.validateAndReadResortDetails(1);
		servicedao.validateAndUpdateResort(22);
		servicedao.validateAnddeleteResort(25);
		
		
		
	}

}
