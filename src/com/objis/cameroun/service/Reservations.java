package com.objis.cameroun.service;
/**
 * @author fabrice bodiongson
 *Dans cette classe nous avons les services de notre application.
 *
 */
import com.objis.cameroun.domaine.Etudiant; // couche m�tier

public class Reservations extends Etudiant {
private String menue;
private String entr�;
private String resistance;
private String sortie;
private String lechef;
private String jeunesse;
private String action;
private String fiction;
private String drame;
public Reservations() { //Appel du constructeur avec sans param�tres du parent , pour fixer l'�tat initial de l'objet
	super();
}
//Red�finition de la methode domaine place() issue de classe Etudiant.--->Signature methode identique mais on modifie les parametres.
public Reservations(String menue, String entr�, String resistance, String sortie, String lechef, String jeunesse,
		String action, String fiction, String drame) {
	super();       //Appel de constructeur de la classe Reservation.
	this.menue = menue;
	this.entr� = entr�;
	this.resistance = resistance;
	this.sortie = sortie;
	this.lechef = lechef;
	this.jeunesse = jeunesse;
	this.action = action;
	this.fiction = fiction;
	this.drame = drame;
}
public String getMenue() {
	return menue;
}
public void setMenue(String menue) {
	this.menue = menue;
}
public String getEntr�() {
	return entr�;
}
public void setEntr�(String entr�) {
	this.entr� = entr�;
}
public String getResistance() {
	return resistance;
}
public void setResistance(String resistance) {
	this.resistance = resistance;
}
public String getSortie() {
	return sortie;
}
public void setSortie(String sortie) {
	this.sortie = sortie;
}
public String getLechef() {
	return lechef;
}
public void setLechef(String lechef) {
	this.lechef = lechef;
}
public String getJeunesse() {
	return jeunesse;
}
public void setJeunesse(String jeunesse) {
	this.jeunesse = jeunesse;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public String getFiction() {
	return fiction;
}
public void setFiction(String fiction) {
	this.fiction = fiction;
}
public String getDrame() {
	return drame;
}
public void setDrame(String drame) {
	this.drame = drame;
}
}
