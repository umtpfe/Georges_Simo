package com.formafast.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formafast.model.CompM; 
import com.formafast.dao.CompMDAO;

@Service
@Transactional
public class CompMServiceImpl implements CompMService {

	@Autowired
	private CompMDAO compMDAO;

	@Transactional
	public void addCompM(CompM compM) {
		compMDAO.addCompM(compM);
	}

	@Transactional
	public List<CompM> getAllCompMs() {
		return compMDAO.getAllCompMs();
	}

	@Transactional
	public void deleteCompM(Integer compMId) {
		compMDAO.deleteCompM(compMId);
	}

	public CompM getCompM(int empid) {
		return compMDAO.getCompM(empid);
	}

	public CompM updateCompM(CompM compM) {
		// TODO Auto-generated method stub
		return compMDAO.updateCompM(compM);
	}

	public void setCompMDAO(CompMDAO compMDAO) {
		this.compMDAO = compMDAO;
	}

}
