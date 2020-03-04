public class Rangee {
	
	public Jeton[] tab;
	public int indiceJeton = 0;
	
	public Rangee() {
		this.tab = new Jeton[Modele.DIFFICULTE];
		
	}
	
	
	public void ajoutJeton(Jeton j) {
		tab[indiceJeton] = j;
		indiceJeton++;
		if(indiceJeton == Modele.DIFFICULTE) {
			rangeeComplete();
		}
	}


	private void rangeeComplete() {
		// \_o_/ 
	}
	
	
	
}
