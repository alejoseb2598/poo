package paquetet;
import javax.swing.JOptionPane;

public class Triquii {

	private static int contador=0;
	private static char tablero[][];

	public static void main(String args[]){
		tablero= new char[3][3];
		llenar();
		iniciar();
		mostrar();
		while(contador<=9){
			captura();
			jugar();
			mostrar();

		}
		System.out.print("\n");


	}


	public static void llenar(){
		
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){

				tablero[i][j]='-';
			
			}
		}
	}

	public static void mostrar(){
		for (int i=0; i<3; i++){
			for (int j=0; j<3; j++){
				System.out.print(tablero[i][j]+"\t ");
			}System.out.println(" ");
		}
	}




	public static void iniciar(){

		tablero[1][1]='o';
		contador++;
	}





	public static void captura(){
		int cuenta=0;
		int x, y;
		do{
			x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar x"));
			y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar y"));
			if(tablero[x][y]=='-'){
				tablero[x][y]='x';
				contador++;
				cuenta++;
			}
		}while(cuenta==0);
	}
	public static void jugar(){

		int v=0, h=0,bandera=0;

		while(contador<9 & (v<3) & bandera==0){
			while(contador<9 & (h<3) & bandera==0){

				if(tablero[h][v]!='x'){

					validar(h,v);
					contador++;
					bandera++;

				}
				h++;
			}
			v++;

		}
	}


	public static void validar(int h, int v){
		boolean bandera= true;
		if((v+1)<3){
			if(tablero[h][v+1]== '-' & bandera==true){
				tablero[h][v+1]='o';
				bandera=false;
			}
			
		}
		if((v-1)>=0){
			if(tablero[h][v-1]== '-' & bandera==true){
				tablero[h][v-1]='o';
				bandera=false;
			}
		}
		if((h+1)<3){
			if(tablero[h+1][v] == '-' & bandera==true){
				tablero[h+1][v]='o';
				bandera=false;
			}
		}
		if((h-1)>=0){
			if(tablero[h-1][v]=='-' & bandera==true){
				tablero[h-1][v]='o';
				bandera=false;
			}
		}
	}
}

