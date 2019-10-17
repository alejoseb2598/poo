
public class Main {
	public static char Tablero[][];
	static Logica Logica = new Logica();
	static Interfaz Jugar = new Interfaz();
	public static void main(String[] args) {
		Tablero= new char[8][8];
		Logica.llenar();
		Logica.iniciar();
		Logica.mostrar();
		while (Logica.contador<63) {
			Jugar.jugUno();
			Logica.mostrar();
			Jugar.jugDos();
			Logica.mostrar();
		}
		

}
}
