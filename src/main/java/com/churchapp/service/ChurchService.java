package com.churchapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.churchapp.model.Church;
import com.churchapp.repository.ChurchRepository;

@Service
public class ChurchService {
	
	@Autowired
	private ChurchRepository churchRepo;
	
	public void createChurch(Church church) {
		this.churchRepo.save(church);
	}
	
	public Church findByName(String name) {
		return this.churchRepo.findByName(name);
	}

	public Church findById(Integer id) {
		return this.churchRepo.findById(id);
	}
	
	public List<Church> getAll(){
		return this.churchRepo.findAll();
	}
	
	public void updateChurch(Church church) {
		this.churchRepo.save(church);
	}
	
	public void deleteChurch(String name) {
		Church church = findByName(name);
		this.churchRepo.delete(church);
	}
}
