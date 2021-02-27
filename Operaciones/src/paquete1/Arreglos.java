package paquete1;



public class Arreglos {

	public static void main(String[] args) {
		
		//Creamos un arreglo de tipo cualquier tipo
	/*int arreglo[] = {10, 5, 7};
	
	/*arreglo[0] = 10;
	arreglo[1]= 5;
	arreglo[2]= 7;*/
	
	/*for(int i= 0; i<arreglo.length; i++) {
		System.out.println("Arreglo en indice: "+ i + " es igual a " + arreglo[i]);
		
	}*/
	
	//Arreglos Bidimensionales (matrices)
	
		//Estructura de 3x3
		int x[] [];
		x = new int [3] [3];
		x[0][0] = 1;
		x[0][1] = 2;
		x[0][2] = 3;
		x[1][0] = 4;
		x[1][1] = 5;
		x[1][2] = 6;
		x[1][3] = 7;
		x[1][4] = 8;
		x[2][1] = 9;
		//for anidados ya que son de dos niveles las matrices osea [][]
		for (int i = 0; i < 3; i++) {
			
			for(int j =0; j<3; j++) {
				
				System.out.println("x["+i+"] ["+j+"] = " +x[i][j]);
			}
		}
	
	
  }

}
