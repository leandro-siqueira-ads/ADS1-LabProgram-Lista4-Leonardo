package lista4ex13;

import java.util.Scanner;

//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100. 

public class lista4ex13 {

public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		int numero;
		int aux = 0;	
		
	
for (int i=1; i<=20; i++) {
	
	System.out.println("Digite 20 numeros: ");
	numero = entrada.nextInt();
	
	if (numero >= 0 && numero <= 100) {
		
		aux = aux + 1;
		
	}
	
	 

}
System.out.println("Total de numeros queestao entre 0 e 100: "+aux);
  
}

}
