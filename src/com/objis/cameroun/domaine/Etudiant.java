package com.objis.cameroun.domaine;//Couche métier.

public class Etudiant {// propriété spécifique a l'Etudiant
private String nom;
private String prenom;
private String Matricule;
protected int Numerotelephone;
public String date;
public String heure;
public int montant;
public int numeroTicket;

public Etudiant(String nom, String prenom, String matricule, String date,String heure, int numerotelephone, int montant,
		int numeroTicket) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	Matricule = matricule;
	Numerotelephone = numerotelephone;
	this.date = date;
	this.heure = heure;
	this.montant = montant;
	this.numeroTicket = numeroTicket;
}

/**
 * methode qui affiche les informations
 * sur l'Etudiant donne en paramètre
 * @param p
 */
public Etudiant() {

}
public String getNom() {//return nom .
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
public String getMatricule() {
	return Matricule;
}
public void setMatricule(String matricule) {
	Matricule = matricule;
}
public String getHeure() {
	return heure;
}
public void setHeure(String heure) {
	this.heure = heure;
}
public int getNumerotelephone() {
	return Numerotelephone;
}
public void setNumerotelephone(int numerotelephone) {
	Numerotelephone = numerotelephone;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getMontant() {
	return montant;
}
public void setMontant(int montant) {
	this.montant = montant;
}
public int getNumeroTicket() {
	return numeroTicket;
}
public void setNumeroTicket(int numeroTicket) {
	this.numeroTicket = numeroTicket;
}
	@Override
	public String toString() {// REDEFINITION METHODE toString() issue de la classe java.lang.Object (la mère de toutes les classes) --> toString() permet d'avoir l'état de l'Objet lorsqu'on essaie d'afficher la référence d'un objet
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", Matricule=" + Matricule + ", Numerotelephone="
				+ Numerotelephone + ", date=" + date + ", heure=" + heure + ", numeroTicket=" + numeroTicket + "]";
	}	

}
