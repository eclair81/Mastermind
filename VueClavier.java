import java.awt.Button;
import java.awt.Dimension;
import java.awt.Panel;

public class VueClavier extends Panel{

	private static final long serialVersionUID = 1L;

	public VueClavier() {
		super();
		
		for(int i = 0; i<Modele.COULEURS.length; i++) {
			Button b = new Button();
			b.setBackground(Modele.COULEURS[i]);
			b.setPreferredSize(new Dimension(30,30));;
			this.add(b);
		}
	}
	
	public static void main(String[] args) {
		new VueClavier();
	}
	
}