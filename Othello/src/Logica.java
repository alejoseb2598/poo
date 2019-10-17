
public class Logica {
	public static int contador= 0;
public static void llenar() {
	Main Tablero = new Main();
	for(int i = 0;i<8;i++) {
		for(int j = 0;j<8;j++) {
			Tablero.Tablero[i][j]= '-';
		}
	}
}
public static void mostrar() {
	Main Tablero = new Main();
	for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
			System.out.print(Tablero.Tablero[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println("===========");
}
public static void iniciar() {
	Main Tablero = new Main();
	Tablero.Tablero[3][3]= 'B';
	Tablero.Tablero[3][4]='N';
	Tablero.Tablero[4][3]='N';
	Tablero.Tablero[4][4]='B';
	contador = contador+4;
}
}
