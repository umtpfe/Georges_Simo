package com.formafast.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formafast.model.Company;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addCompany(Company company) {
		sessionFactory.getCurrentSession().saveOrUpdate(company);

	}

	@SuppressWarnings("unchecked")
	public List<Company> getAllCompanys() {

		return sessionFactory.getCurrentSession().createQuery("from Company")
				.list();
	}

	@Override
	public void deleteCompany(Integer companyId) {
		Company company = (Company) sessionFactory.getCurrentSession().load(
				Company.class, companyId);
		if (null != company) {
			this.sessionFactory.getCurrentSession().delete(company);
		}

	}

	public Company getCompany(int empid) {
		return (Company) sessionFactory.getCurrentSession().get(
				Company.class, empid);
	}

	@Override
	public Company updateCompany(Company company) {
		sessionFactory.getCurrentSession().update(company);
		return company;
	}

}