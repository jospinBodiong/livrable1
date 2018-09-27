package com.objis.cameroun.presentation;
import java.util.Scanner;

import com.objis.cameroun.domaine.Etudiant;
/**
 * Classe chargée des instanciations et affichage.
 * @author fabrice bodiongson
 *
 */
public class Espacedetente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// Chargé de recupere les donnees entrees au clavier.
		Scanner sca = new Scanner(System.in);
        Etudiant place=new Etudiant();
         char reponse='O';
        while (reponse=='O')
{   
	/**
	 * Methode qui permet juste
	 * d'afficher un message de bienvenue.
	 */
System.out.println("------------------------------------------------------------------");
System.out.println("***Bienvenue dans ton application espace de detente etudiant*****");
System.out.println("------------------------------------------------------------------");
/**Methode qui retourne le nom
 * donné en parametre par l'etudiant.
 * @param Etudiant
 * return place.getNom()
 */

System.out.println("Entrez vos Identifiants pour demarer.");
System.out.print("NOM:");
place.setNom(sc.next());
System.out.print("PRENOM:");
place.setPrenom(sc.next());
System.out.print("Matricule:");
place.setMatricule(sc.next());
System.out.print("Date:");
place.setDate(sc.next());
System.out.print("ENTREZ votre numero de telephone");
place.setNumerotelephone(sc.nextInt());
System.out.print("Tickets Prix:100/500Fcfa entrez L'heure:");
place.setHeure(sc.next());

System.out.println ("Vous pouvez à present passer votre commande cher(e)"+place.getPrenom());
System.out.println("1-Pour la Reservation restaurant taper 10 ");
System.out.println("2-Pour la reservation de Places de cinema tapez 20");
int reservation= sc.nextInt();
switch (reservation) {	
case 10:
{
	
	System.out.println("Bienvenue a objis restaurant"+ reservation);
	System.out.println("Pour avoir le menue du entré jour: Entrez 01 pour lundi");
	System.out.println("02=Mardi");
	System.out.println("03=Mercredi");
	System.out.println("04=Jeudi ");
	System.out.println("05=Vendredi");
	}
int resto= sc.nextInt();
switch(resto) {
case 01:
{
	System.out.println("Menue:Lundi"+resto);
	System.out.println("Entré:Salade de choux");
	System.out.println("Resistance: Sauce paysanne Riz nature");
	System.out.println("Sortie: Oranges ");
	System.out.println("Bonne appetit à tous.");
	place.setMontant(100);
	break;
}
case 02:
{
System.out.println("Menue:Mardi"+resto);
System.out.println("Entré:Salade haitienne");
System.out.println("Resistance:Poulet YASSA Riz cantonné");
System.out.println("Sortie:Glace frambroise");
System.out.println("Bonne appetit à tous.");
place.setMontant(100);
break;
}
case 03:
{
System.out.println("Menue:Mercredi"+resto);
System.out.println("Entré:Salade de choux");
System.out.println("Resistance: Haricot rouge au thon+batons de manioc");
System.out.println("Sortie: Oranges ");
System.out.println("Bonne appetit à tous.");
place.setMontant(100);
break;
}
case 04:
{
System.out.println("Menue:Jeudi"+resto);
System.out.println("Entré: Salade de Spaguetti ");
System.out.println("Resistance: Sauce basquaise poisson Riz nature");
System.out.println("Sortie: Salade de fruits ");
System.out.println("Bonne appetit à tous.");
place.setMontant(100);
}
case 05:
{
System.out.println("Menue:Vendredi"+resto);
System.out.println("Entré:Salade parisienne");
System.out.println("Resistance: Ndole aux fruits de mer ");
System.out.println("Sortie: Tranche D'ananas ");
System.out.println("Bonne appetit à tous.");
place.setMontant(100);
}
}System.out.println("Chers,"+place.getNom()+place.getPrenom()+" matricule:"+place.getMatricule()+"  N°tel:"+place.getNumerotelephone()+" vous avez reservé un ticket de restaurant"+"de"+place.getMontant()+"Cfa qui sera deduit de votre compte mobile!" +"ce"+place.getDate()+"à"+place.getHeure());
System.out.println("*******Bon sejour dans votre espace detente Etudiants********");


default:
System.out.println("Voulez vous faire une autre reservation? Si oui tapez O");
reponse=sca.nextLine().charAt(0);


/**Methode qui retourne et affiche la reservation
 * donné en parametre par l'etudiant.
 * @param Etudiant
 * return place.getHeure();place.setMontant
 */

case 20:
{
	System.out.println("*Bienvenue au Canal olympia cinema a l'affiche ce Lundi*"+ reservation);
	System.out.println("Pour reserver un film de lundi tapez =>1");
	System.out.println("Pour mardi => 2");
	System.out.println("Mercredi => 3");
	System.out.println("Jeudi    => 4 ");
	System.out.println("Vendredi => 5");
	System.out.println("Samedi   => 6");
	System.out.println("Dimanche => 7");
}

	int places= sc.nextInt();
	switch(places) {
	case 1:
	{
		
System.out.println("Bienvenue au Canal olympia cinema"+ places);
System.out.println("Jeunesse 12H : Milo");
System.out.println("Action 14H : Black man");
System.out.println("Fiction 16H : Constantine");
System.out.println("Drame 18H : Bad boy");
System.out.print("Entrez l'heure du film choisis");
place.setHeure(sc.next());
place.setMontant(500);
break;
	}

case 2:
{
System.out.println("Bienvenue a Olympia cinema Etudiant nous vous offrons ce Mardi à:"+ places);
System.out.println("12H/Jeunesse:");
System.out.println("14H/Action: Casino");
System.out.println("16H/Fiction: Marvel's");
System.out.println("18H/Drame: Lost");
System.out.print("Entrez l'heure du film choisis");
System.out.println(sc.next());
place.setMontant(500);
break;
}
	
	case 3:
	{
	System.out.println("Bienvenue a Olympia cinema Etudiant"+ places);
	System.out.println("12H/Jeunesse: Paradis");
	System.out.println("14H/Action: Taxi");
	System.out.println("16H/Fiction:Blood man");
	System.out.println("18H/Drame: Le triangle maudit");
	System.out.print("Nom et HeureFilm Choisis:");
	place.setHeure(sc.next());
	place.setMontant(500);
	break;
	}
	case 4:
	{
	System.out.println("*Bienvenue a Olympia cinema Etudiant au programme ce Jeudi*."+ places);
	System.out.println("Jeunesse:12H/Sandy");
	System.out.println("Action: 14H/Barbara");
	System.out.println("Fiction: 16H/the sky");
	System.out.println("Drame: 18H/Anonym's");
	System.out.print("Nom et HeureFilm Choisis:");
	place.setHeure(sc.next());
	place.setMontant(500);
	break;
	}
	case 5:
	{
	System.out.println("Bienvenue a cineOlympia cinema au programme ce vendredi"+ places);
	System.out.println("12H/Jeunesse: Blanche neige");
	System.out.println("14H/Action:Mission comando");
	System.out.println("16H/Fiction: light");
	System.out.println("18H/Drame: The last passenger's");
	System.out.print("Nom et HeureFilm Choisis:");
	place.setHeure(sc.next());
	place.setMontant(500);
	break;
	}
	case 6:
	{
	System.out.println("*Bienvenue a Olympia cinema Etudiant au programme ce week end de Samedi*."+ places);
	System.out.println("Jeunesse12H : Maya l'abeille");
	System.out.println("Action14H : Hitler");
	System.out.println("Fiction16H : Magic night");
	System.out.println("Drame18H : Plane");
	System.out.print("Nom et HeureFilm Choisis:");
	place.setHeure(sc.next());
	place.setMontant(500);
	break;
	}

	case 7:
	{
	System.out.println("*Bienvenue a Olympia cinema au programme ce dimanche*"+ places);
	System.out.println("Jeunesse12H : pirata et capitano");
	System.out.println("Action14H : DRUM");
	System.out.println("Fiction16H : Harry potter");
	System.out.println("Drame18H :Zoom");
	System.out.print("Entrez le nom et l'heure du film choisis");
	place.setHeure(sc.next());
	place.setMontant(500);
	break;
	}

}System.out.println("Chers,"+place.getNom()+place.getPrenom()+" matricule:"+place.getMatricule()+" N°tel:"+place.getNumerotelephone()+" cout"+place.getMontant()+" Cfa"+" seront debité de votre compte!Vous avez reservé un ticket cinema pour le film " + place.getHeure());
System.out.println("******Bon sejour dans votre espace detente Etudiants*******");
}
}
}
}