package org.perscholas.sbahibernateproject.services;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.perscholas.sbahibernateproject.HibernateUtil;
import org.perscholas.sbahibernateproject.models.Office;


public class OfficeServies {
	public void createOrUpateOffices(Office t) {

		Transaction tx = null;
		Session session = HibernateUtil.factory.openSession();
		try {

			tx = session.beginTransaction();
			session.merge(t);
			tx.commit();

		} catch(
		HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}

}
