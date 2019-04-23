package com.formafast.dao;

import java.util.List;

import com.formafast.model.Company;

public interface CompanyDAO {

	public void addCompany(Company company);

	public List<Company> getAllCompanys();

	public void deleteCompany(Integer companyId);

	public Company updateCompany(Company company);

	public Company getCompany(int companyid);
}
