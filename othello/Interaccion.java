import javax.swing.JOptionPane;

public class Interaccion {
	Logica Logica = new Logica();
	public void mostrar(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(Logica.getTablero()[i][j]);
			}
			System.out.println();
		}
		System.out.println("========");
	}
	public  void captura(){
		int x,y, cuenta=0;
		do{
			x = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresar x"));
			y = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar y"));
			if(Logica.getTablero()[x][y]=='-'){
				Logica.getTablero()[x][y] = 'x';

				Logica.setContador(Logica.getContador() + 1);
				cuenta++;
			}
		}while(cuenta==0);
	}
}
