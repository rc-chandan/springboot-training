package repository;

import entity.Movie;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ImdbRepository {
	public void createMovie(Movie movie) {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction txn = session.beginTransaction();
			session.save(movie);
			txn.commit();
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
	}

	public void getAllMovies() {
		try {
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			List<Movie> movies = session.createNativeQuery(
					"select * from Movie", Movie.class).getResultList();

			System.out.println(movies);
			session.close();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
	}
}
