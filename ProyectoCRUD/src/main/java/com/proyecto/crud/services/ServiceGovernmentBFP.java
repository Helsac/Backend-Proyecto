package com.proyecto.crud.services;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.crud.entities.GovernmentBFP;
import com.proyecto.crud.repositories.RepositoryGovernmentBFP;

@Service
public class ServiceGovernmentBFP {
	@Autowired
	private RepositoryGovernmentBFP governmentBFPRep;
	
	public List<GovernmentBFP> listGovernmentBFP(){
		return governmentBFPRep.findAll();		
	}
	
	public GovernmentBFP searchGovernmentBFP(Long id) throws Exception {
		GovernmentBFP act = governmentBFPRep.findById(id).get();
		if(act == null) {
			throw new Exception("No se encontró");
		}
		return act;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public GovernmentBFP updateGovernment(GovernmentBFP gInput) throws Exception {
		GovernmentBFP act = governmentBFPRep.findById(gInput.getId()).get();
		if(act == null) {
			throw new Exception("No se encontró");
		}
		return governmentBFPRep.save(gInput);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public GovernmentBFP registerGovernmentBFP(GovernmentBFP gInput) throws Exception{
		GovernmentBFP act = null;
		act = gInput;
		if(act == null) {
			throw new Exception("No se pudo registrar");
		}
		return governmentBFPRep.save(act);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void deleteGovernmentBFP(Long id ) throws Exception{
		GovernmentBFP act = governmentBFPRep.findById(id).get();
		if(act == null) {
			throw new Exception("No se encontró");
		}
		governmentBFPRep.deleteById(id);
	}
	
}
