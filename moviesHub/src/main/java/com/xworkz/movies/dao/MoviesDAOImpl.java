package com.xworkz.movies.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.movies.dto.MovieDTO;
import com.xworkz.singleSessionFactory.SingleSessionFactory;

public class MoviesDAOImpl implements MoviesDAO{
	public void saveMovie(MovieDTO movieDTO) {
		Session session = null;

		System.out.println("invoked saveMovie");
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(movieDTO);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			System.out.println("rolled back the changes as there was some exception ");

		}

		finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void updateMovie(int movieId) {
		System.out.println("invoked update");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			// to update anyting we need to get it first to get we not need transaction
			MovieDTO moviedto = session.get(MovieDTO.class, movieId);
			moviedto.setRatings(5);
			session.beginTransaction();
			session.update(moviedto);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("rolled back the changes as there was some exception ");
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void readMovie(int movieId) {
		System.out.println("invoked read");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			MovieDTO moviedto = session.get(MovieDTO.class, movieId);
			System.out.println(moviedto);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

		}

	}

	@Override
	public void deleteMovie(int movieId) {
		System.out.println("invoked delete");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSessionFactory();
			session = sessionFactory.openSession();
			// first get and then delete
			MovieDTO moviedto = session.get(MovieDTO.class, movieId);
			session.beginTransaction();
			session.delete(moviedto);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("rolled back the changes as there was some exception ");
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}

			SingleSessionFactory.closeFactory();
		}

	}

}
