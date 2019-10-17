package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Gui extends JFrame implements ActionListener {

	private ArrayList <JButton> botones; 
	Panel panel1;
	private JPanel panel2;
	private JLabel text;
	private JTextField cajatexto;
	private ActionListener action;

	public Gui() {

		super("Ejemplo de interfaz");
		accion();
		crearbotones();
		//setText();
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void crearbotones() {
		setLayout(new BorderLayout());
		panel1= new Panel();
		panel1.setLayout(new GridLayout(5,5));
		botones = new ArrayList <JButton>();
		for(int i=0; i<10; i++) {
			botones.add(i, new JButton("Boton" + (i+1)));
			panel1.add(botones.get(i));
			if(i<5) {
				botones.get(i).addActionListener(action);
			}
			else {
				botones.get(i).addActionListener(this);
			}
		}

	}


	public void accion() {
		@Override
		public void actionPerformed(ActionEvent e) {

			action =new ActionListener() {

				String opcion =(String)e.getActionCommand();
				if(opcion.equals("Boton 1")) {

					botones.get(0).setText("Le oprimio");
				}
				else if(opcion.equals("Boton 2")){


				}
				else if(opcion.equals("Boton 3")) {

				}
				else if(opcion.equals("Boton 4")) {

				}
				else {

				}
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

				}
			};
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
