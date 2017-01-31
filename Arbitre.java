package projet;

import java.util.Calendar;
import java.util.Scanner;

public class Arbitre extends Licencie {
	public int cat�gorie;
	public int getCat�gorie() {
		return cat�gorie;
	}
	public void setCat�gorie(int cat�gorie) {
		this.cat�gorie = cat�gorie;
	}
	public Arbitre(int x,String nom,String pr�nom,Calendar dateDeValidit�,Club club){
		super(nom,pr�nom,dateDeValidit�,club);
		cat�gorie=x;
	}
	public Arbitre(){
		super();
	}
	public void ModifierArbitre(Scanner sc){
		
		boolean x=this.modifierLicencie(sc);
		if(!x){
		System.out.println("Si vous souhaitez modifier sa cat�gorie taper le chiffre d�sir� (va de 1 � 3)");
		int n=sc.nextInt();
		while(n!=1&&n!=2&&n!=3){
			System.out.println("Vous avez tapez un nombre incorrect, veuillez recommencez s'il vous pla�t (les cat�gories vont de 1 � 3)");
			n=sc.nextInt();
			}
		this.setCat�gorie(n);
		}
		
	}
}
