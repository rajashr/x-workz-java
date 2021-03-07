package com.xworkz.resort.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.resort.dto.ResortDTO;

public class ResortDAOImpl implements ResortDAO {

	@Override
	public void save(ResortDTO dto) {
		Session session=null;
		SessionFactory sessionFactory=null;
		try {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		//SessionFactory
		 sessionFactory = configuration.buildSessionFactory();
//Session
		 session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		}finally {
		session.close();
		sessionFactory.close();
		}
	}

	@Override
	public void readResortDetails(int resortId) {
		Session session=null;
		SessionFactory sessionFactory=null;
		try {


		Configuration configuration = new Configuration();

		configuration.configure("hibernate.cfg.xml");
		 sessionFactory = configuration.buildSessionFactory();

		 session = sessionFactory.openSession();
		ResortDTO dto = session.get(ResortDTO.class, resortId);
		System.out.println(dto);
		}finally {
		session.close();
		sessionFactory.close();
		}

	}

	@Override
	public void updateResort(int resortId) {
		Session session=null;
		SessionFactory sessionFactory=null;
		try {

		System.out.println("invoked update method");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		 sessionFactory = configuration.buildSessionFactory();
		 session = sessionFactory.openSession();
		ResortDTO resortDTO = session.get(ResortDTO.class, resortId);

		resortDTO.setLocation("Gujarath");
		Transaction transaction = session.beginTransaction();
		session.update(resortDTO);
		System.out.println(resortDTO);
		transaction.commit();
		}finally {
		session.close();
		sessionFactory.close();
		}

	}

	@Override
	public void deleteResort(int resortId) {
		Session session=null;
		SessionFactory sessionFactory=null;
		try {

		System.out.println("invoked delete method");
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		 session = sessionFactory.openSession();
		ResortDTO resortDTO = session.get(ResortDTO.class, resortId);
		Transaction transaction = session.beginTransaction();
		session.delete(resortDTO);
		transaction.commit();
		}finally {
		session.close();
		sessionFactory.close();
		}

	}

}
