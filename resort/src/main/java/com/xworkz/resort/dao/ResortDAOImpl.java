package com.xworkz.resort.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO{

	@Override
	public void save(ResortDTO dto) {
		//start the hibernate by creating obj of config
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	

}
