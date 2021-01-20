package com.proyecto.crud.restservices;

import java.util.List;
import java.io.*; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.proyecto.crud.entities.GovernmentBFP;
import com.proyecto.crud.services.ServiceGovernmentBFP;

@RestController
@RequestMapping("/govAnual")
public class RestServiceGovernmentBFP {
	@Autowired
	private ServiceGovernmentBFP governmentBFPServ;
	
	
	
	@GetMapping("/govBFP")
	public List<GovernmentBFP> listGovBFP(){
		return governmentBFPServ.listGovernmentBFP();
	}
	
	
	@GetMapping("/govBFP/{id}")
	public GovernmentBFP findGovBFP(@PathVariable(value ="id") Long id) {
		GovernmentBFP act= null;
		try {
			act = governmentBFPServ.searchGovernmentBFP(id);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se puede encontrar");
		}
		return act;
	}
	
	
	@PostMapping("/govBFP")
	public GovernmentBFP registerGovBFP(@RequestBody GovernmentBFP gInput) {
		GovernmentBFP act = null;
		try {
			act = governmentBFPServ.registerGovernmentBFP(gInput);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se pudo registrar");
		}
		return act;
	}
	
	
	@PutMapping("/govBFP")
	public GovernmentBFP updateGovBFP(@RequestBody GovernmentBFP gInput) {
		GovernmentBFP act = null;
		try {
			act = governmentBFPServ.updateGovernment(gInput);
		} catch (Exception e){
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo encontrar");
		}
		return act;
	}
	
	@DeleteMapping("/govBFP/{id}")
	public void deleteGovBFP(@PathVariable(value = "id") Long id) {
		try {
			governmentBFPServ.deleteGovernmentBFP(id);
		}catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo encontrar");
		}
	}
	
}
