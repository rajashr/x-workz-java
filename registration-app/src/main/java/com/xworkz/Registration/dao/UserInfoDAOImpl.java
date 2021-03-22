package com.xworkz.Registration.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Registration.dto.UserInformationDTO;

public class UserInfoDAOImpl implements UserInfoDAO{

	@Override
	public void saveUserDetails(UserInformationDTO userInfoDTO) {
		System.out.println("invoked save User Details");
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(userInfoDTO);
		transaction.commit();
        session.close();
        sessionFactory.close();
		
	}

}
