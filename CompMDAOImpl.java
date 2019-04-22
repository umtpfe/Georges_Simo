package com.formafast.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formafast.model.CompM;
import com.formafast.dao.CompMDAO;

@Repository
public class CompMDAOImpl implements CompMDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(CompM compM) {
		sessionFactory.getCurrentSession().saveOrUpdate(compM);

	}

	@SuppressWarnings("unchecked")
	public List<CompM> getAllEmployees() {

		return sessionFactory.getCurrentSession().createQuery("from CompM")
				.list();
	}

	public void deleteCompM(Integer compMId) {
		CompM compM = (CompM) sessionFactory.getCurrentSession().load(
				CompM.class, compMId);
		if (null != compM) {
			this.sessionFactory.getCurrentSession().delete(compM);
		}

	}

	public CompM getCompM(int compMid) {
		return (CompM) sessionFactory.getCurrentSession().get(
				CompM.class, compMid);
	}
	public CompM updateCompM(CompM compM) {
		sessionFactory.getCurrentSession().update(compM);
		
		return compM;
	}

	public void addCompM(CompM compM) {
		// TODO Auto-generated method stub
		
	}

	public List<CompM> getAllCompMs() {
		// TODO Auto-generated method stub
		return null;
	}
	
}