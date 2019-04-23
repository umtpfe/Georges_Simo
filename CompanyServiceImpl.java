package com.formafast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formafast.dao.CompanyDAO;
import com.formafast.model.Company;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDAO companyDAO;

	@Override
	@Transactional
	public void addCompany(Company company) {
		companyDAO.addCompany(company);
	}

	@Override
	@Transactional
	public List<Company> getAllCompanys() {
		return companyDAO.getAllCompanys();
	}

	@Override
	@Transactional
	public void deleteCompany(Integer companyId) {
		companyDAO.deleteCompany(companyId);
	}

	public Company getCompany(int empid) {
		return companyDAO.getCompany(empid);
	}

	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return companyDAO.updateCompany(company);
	}

	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}

}
