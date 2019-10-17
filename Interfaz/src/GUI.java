import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame implements ActionListener{
	private ArrayList<JButton> botones;
	private JPanel panel1, panel2;
	private JLabel text;
	private JTextField CajaTexto;
	private ActionListener action;
	
	public GUI() {
		super("ejemplo de interfaz");
		accion();
		CrearBotones();
		//CrearText();
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public void accion() {
		action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String opcion = (String)e.getActionCommand();
				if (opcion.equals("Boton 1")) {
					botones.get(0).setText("Oprimio el boton 1");
				}if (opcion.equals("Boton 2")) {
					botones.get(1).setText("Oprimio el boton 2");
				}if (opcion.equals("Boton 3")) {
					botones.get(2).setText("Oprimio el boton 3");
				}if (opcion.equals("Boton 4")) {
					botones.get(3).setText("Oprimio el boton 4");
				}if (opcion.equals("Boton 5")) {
					botones.get(4).setText("Oprimio el boton 5");
				}
			}
		};
	}
	
public void CrearBotones() {
	setLayout(new BorderLayout());
	panel1 = new JPanel();
	panel1.setLayout(new GridLayout(5, 5));
	botones = new ArrayList<JButton>();
	for(int i=0; i<10; i++) {
		botones.add(i, new JButton("Boton "+(i+1)));
		panel1.add(botones.get(i));
		if (i<5) {
			botones.get(i).addActionListener(action);
		}else {
			botones.get(i).addActionListener(this);
		}
	}
	add(panel1);
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String opcion = (String)arg0.getActionCommand();
	if (opcion.equals("Boton 6")) {
		botones.get(5).setText("Oprimio el boton 6");
	}if (opcion.equals("Boton 7")) {
		botones.get(6).setText("Oprimio el boton 7");
	}if (opcion.equals("Boton 8")) {
		botones.get(7).setText("Oprimio el boton 8");
	}if (opcion.equals("Boton 9")) {
		botones.get(8).setText("Oprimio el boton 9");
	}if (opcion.equals("Boton 10")) {
		botones.get(9).setText("Oprimio el boton 10");
	}
}
	
}




