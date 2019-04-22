package com.formafast.dao;

import java.util.List;

import com.formafast.model.CompM;

public interface CompMDAO {

	public void addCompM(CompM compM);

	public List<CompM> getAllCompMs();

	public void deleteCompM(Integer compMId);

	public CompM updateCompM(CompM compM);

	public CompM getCompM(int compMid);
}
