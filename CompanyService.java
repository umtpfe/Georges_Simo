package com.formafast.service;

import java.util.List;

import com.formafast.model.Company;

public interface CompanyService {
	
	public void addCompany(Company employee);

	public List<Company> getAllCompanys();

	public void deleteCompany(Integer companyId);

	public Company getCompany(int companyid);

	public Company updateCompany(Company company);
}
