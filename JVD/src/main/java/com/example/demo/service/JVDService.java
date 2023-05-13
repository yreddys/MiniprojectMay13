package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.JVD;

public interface JVDService {

	public JVD savingData(JVD jvd) throws NotEligiblelException;
	public List<JVD> getData();
}
