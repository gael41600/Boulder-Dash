package projet;

import java.util.Calendar;
import java.util.Scanner;

public class Arbitre extends Licencie {
	public int catégorie;
	public int getCatégorie() {
		return catégorie;
	}
	public void setCatégorie(int catégorie) {
		this.catégorie = catégorie;
	}
	public Arbitre(int x,String nom,String prénom,Calendar dateDeValidité,Club club){
		super(nom,prénom,dateDeValidité,club);
		catégorie=x;
	}
	public Arbitre(){
		super();
	}
	public void ModifierArbitre(Scanner sc){
		
		boolean x=this.modifierLicencie(sc);
		if(!x){
		System.out.println("Si vous souhaitez modifier sa catégorie taper le chiffre désiré (va de 1 à 3)");
		int n=sc.nextInt();
		while(n!=1&&n!=2&&n!=3){
			System.out.println("Vous avez tapez un nombre incorrect, veuillez recommencez s'il vous plaît (les catégories vont de 1 à 3)");
			n=sc.nextInt();
			}
		this.setCatégorie(n);
		}
		
	}
}
