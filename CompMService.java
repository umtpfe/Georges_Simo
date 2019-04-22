package com.formafast.service;

import java.util.List;

import com.formafast.model.CompM;

public interface CompMService {
	
	public void addCompM(CompM compM);

	public List<CompM> getAllCompMs();

	public void deleteCompM(Integer compMId);

	public CompM getCompM(int compMid);

	public CompM updateCompM(CompM compM);
}
