
public class Principal {


	
		public static void main(String[] args){
			Logica Logica = new Logica();
			Interaccion Interaccion = new Interaccion();
			Logica.setTablero(new char[3][3]);
			Logica.llenar();
			Interaccion.mostrar();
			Logica.iniciar();
			Interaccion.mostrar();
		
		while(Logica.getContador()<9) {
				Interaccion.captura();
				Logica.jugar();
				Interaccion.mostrar();
		}

			}
}
