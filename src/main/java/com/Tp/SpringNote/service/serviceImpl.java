package com.Tp.SpringNote.service;

import org.springframework.stereotype.Service;

import com.Tp.SpringNote.dao.Idao;
import com.Tp.SpringNote.metier.Etudiant;
import com.Tp.SpringNote.metier.Formation;

@Service 
public class serviceImpl implements Iservice {

	private Idao dao;
	
	public Idao getDao() {
		return dao;
	}

	public void setDao(Idao dao) {
		this.dao = dao;
	}


	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}

}
