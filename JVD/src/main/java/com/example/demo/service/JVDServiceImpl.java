package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.JVD;
import com.example.demo.repository.JVDRepository;

@Service
public class JVDServiceImpl implements JVDService{

	@Autowired
	private JVDRepository repository;

	@Override
	public JVD savingData(JVD jvd) throws NotEligiblelException {
	if(jvd.getAge()>=20&&jvd.getLand()<=5) {
		return repository.save(jvd);
	}
	throw new NotEligiblelException("you are not eligible");
}

	@Override
	public List<JVD> getData() {
		
		return repository.findAll();
	}
	
	
}


