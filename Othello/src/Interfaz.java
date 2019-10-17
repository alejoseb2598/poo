import java.util.*;

public class Interfaz {
	Main Tablero = new Main();
	boolean bandera = false;
	int x, y;
	int w, v;
	Scanner sc = new Scanner(System.in);

	public  void jugUno() {
		Main Tablero = new Main();
		System.out.println("turno de N");
		Scanner sc = new Scanner(System.in);
		 w = sc.nextInt();
		 v = sc.nextInt();
		validarN();
		Tablero.Tablero[w][v]= 'N';
		Logica.contador++;

	}
	public  void jugDos() {
		Main Tablero = new Main();
		System.out.println("turno de B");
		
		 x = sc.nextInt();
		 y = sc.nextInt();
		validarB();
		Tablero.Tablero[x][y]= 'B';
		Logica.contador++;
			}
		

	
public void validarB( ) {
	int banderaB = 0;
	int vacio=0, cabe=0;

		//Igual o menor que 7//
	// Casilla en Blanco//
		while(banderaB==0) {
			if ((x<=7)||(y<=7)) {
				cabe =1;
				if (Tablero.Tablero[x][y]=='-') {
					vacio =1;
				}else {
					System.out.println("Casilla ocupada,ingrese coordenada de nuevo");	
					 x = sc.nextInt();
					 y = sc.nextInt();
				
				}
			}else {
				System.out.println("Excedido,ingrese coordenada de nuevo");	
				 x = sc.nextInt();
				 y = sc.nextInt();
				 
			}
			if ((vacio==1)&&(cabe==1)) {
				banderaB=1;
			}

		

	}
		
}
public void validarN( ) {
int banderaN = 0;
int vacio=0, cabe=0;

	//Igual o menor que 7//
// Casilla en Blanco//
	while(banderaN==0) {
		if ((w<=7)||(v<=7)) {
			cabe =1;
			if (Tablero.Tablero[w][v]=='-') {
				vacio =1;
			}else {
				System.out.println("Casilla ocupada,ingrese coordenada de nuevo");	
				 w = sc.nextInt();
				 v = sc.nextInt();
			
			}
		}else {
			System.out.println("Excedido,ingrese coordenada de nuevo");	
			 w = sc.nextInt();
			 v = sc.nextInt();
			 
		}
		if ((vacio==1)&&(cabe==1)) {
			banderaN=1;
		}

	

}
}
}