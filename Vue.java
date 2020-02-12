import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Vue extends Frame{

	private static final long serialVersionUID = 1L;

	public Vue() {
		super();
		this.setTitle("Mastermind");
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		new Vue();
	}
	
}
