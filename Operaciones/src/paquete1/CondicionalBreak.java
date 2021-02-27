package paquete1;

public class CondicionalBreak {

	public static void main(String[] args) {
		
		/*for (int i = 0; i <=10; i++) {
			
			System.out.println("Aun estas en el ciclo");
			if (i == 4) {
				continue; //va a cortar el ciclo
			}

			System.out.println("El valor de i es: " + i);
		}*/
		
		//Numeros impares
		/*for(int i =0; i<=100; i++) {
			
			if((i%2) !=0) {
				System.out.println("El numero impar es: " + i);
				
			}
		}*/
		
		//Serie de fibonacci 0,1,1,2,3,5,8,11....
		
		int x = 1;
		int anterior=0;
		int temp;
		
		while(true) {
			
			System.out.println(x);
			temp = x;
			x =x+ anterior;
			anterior = temp;
			
			if(x>100) {
				
				{break;}
			}
		}
		

	}

}
