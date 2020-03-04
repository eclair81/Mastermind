import java.awt.Color;

public class Modele {
	
	public static Color[] COULEURS = {Color.yellow, Color.green, Color.blue, Color.magenta, Color.red, Color.orange, Color.white, Color.black};
	public static int N_TENTATIVES = 10;
	public static int DIFFICULTE = 4;
	public static enum Etat {EN_COURS, GAGNE, PERDU};
	
	public static Rangee solution;
	
	public Modele() {
		tirerSol();
	}
	
	
	public void tirerSol() {
		solution = new Rangee();
		for(int i=0; i<DIFFICULTE; i++) {
			solution.tab[i] = new Jeton(COULEURS[(int)(Math.random()*COULEURS.length)], 10);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
