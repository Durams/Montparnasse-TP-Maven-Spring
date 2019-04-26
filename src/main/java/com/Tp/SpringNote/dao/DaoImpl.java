package com.Tp.SpringNote.dao;

import org.springframework.stereotype.Repository;

import com.Tp.SpringNote.metier.Etudiant;
import com.Tp.SpringNote.metier.Formation;
@Repository
public class DaoImpl implements Idao {

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return e.getId();
	}

}
