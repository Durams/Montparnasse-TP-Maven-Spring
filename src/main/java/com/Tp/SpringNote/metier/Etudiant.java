package com.Tp.SpringNote.metier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Etudiant {
private int id;
private String nom;
private String prenom;

@Autowired
private Formation formation;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Formation getFormation() {
	return formation;
}
public void setFormation(Formation formation) {
	this.formation = formation;
}
@Override
public String toString() {
	return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", formation=" + formation + "]";
}





}
