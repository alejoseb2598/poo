
public class Logica {
	private static  int contador=0;
	private int f  =0;
	private static  char tablero[][];
	public  void llenar(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				getTablero()[i][j] = '-';

			}
		}
	}
	public  void iniciar(){
		getTablero()[1][1]= 'o';
		setContador(getContador() + 1);
	}
	public  void validar(int h, int v){
		boolean bandera = true;
		f=0;
		if(v+1<3){
			if ((getTablero()[h][v+1]=='-')&(bandera)){
				getTablero()[h][v+1]='o';
				bandera = false;
				f=1;
			}
		}
		if(v-1>=0){
			if((getTablero()[h][v-1]=='-')&(bandera)){
				getTablero()[h][v-1]= 'o';
				bandera = false;
				f=1;
			}
		}
		if(h+1<3){
			if((getTablero()[h+1][v]=='-')&(bandera)){
				getTablero()[h+1][v]='o';
				bandera = false;
				f=1;
			}
		}

		if(h-1>=0){
			if((getTablero()[h-1][v]=='-')&(bandera)){
				getTablero()[h-1][v] = 'o';
				bandera = false;
				f=1;
			}
		}
	}
	public  void jugar(){
		int v=0,h=0,bandera=0;
		while((getContador()<9) & (v<3)&(bandera==0)){
			if(h==3) {
				h=0;
			}
			while((getContador()<9) & (h<3)&(bandera==0)){
				if(getTablero()[h][v]=='x'){
 					validar(h,v);
 					if (f!=0) {
 				
					bandera++;
					setContador(getContador() + 1);
 					}
				}
			h++;
			}
			
			v++;
		}
	}
	public  int getContador() {
		return contador;
	}
	public  void setContador(int contador) {
		Logica.contador = contador;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	public char[][] getTablero() {
		return tablero;
	}
	public void setTablero(char tablero[][]) {
		Logica.tablero = tablero;
	}
}
