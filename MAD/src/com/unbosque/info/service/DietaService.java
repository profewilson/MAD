package com.unbosque.info.service;

import java.util.List;

import com.unbosque.info.dao.DietaDAO;
import com.unbosque.info.entidad.Dieta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("DietaService")
@Transactional(readOnly = true)
public class DietaService {

	// DietaDAO is injected...
	@Autowired
	DietaDAO dietaDAO;

	@Transactional(readOnly = false)
	public void addDieta(Dieta dieta) {
		getDietaDAO().addDieta(dieta);
	}

	@Transactional(readOnly = false)
	public void deleteDieta(Dieta dieta) {
		getDietaDAO().deleteDieta(dieta);
	}

	@Transactional(readOnly = false)
	public void updateDieta(Dieta dieta) {
		getDietaDAO().updateDieta(dieta);
	}

	public Dieta getDietaById(int id) {
		return getDietaDAO().getDietaById(id);
	}

	public List<Dieta> getDietas() {
		return getDietaDAO().getDietas();
	}

	public DietaDAO getDietaDAO() {
		return dietaDAO;
	}

	public void setDietaDAO(DietaDAO dietaDAO) {
		this.dietaDAO = dietaDAO;
	}
}

