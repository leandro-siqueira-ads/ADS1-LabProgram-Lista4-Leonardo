package lista4ex12;

import java.util.Scanner;


//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares 

public class lista4ex12 {

public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		int numero;
		int aux = 0;	
		
	
for (int i=1; i<=20; i++) {
	
	System.out.println("Digite 20 numeros: ");
	numero = entrada.nextInt();
	
	if (numero % 2 == 0 ) {
		
		aux = aux + 1;
		
	}
	
	 

}
System.out.println("Total de pares: "+aux);
  
}

}
