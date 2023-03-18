package lista4ex10;

import java.util.Scanner;

//10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação. 


public class lista4ex10 {

		public static void main(String[] args) {
			
			
			Scanner entrada = new Scanner(System.in);	
			
			int numero;
			int total;
		
			System.out.println("Digite o numero da tabuada desejada: ");
			numero = entrada.nextInt();
		
	for (int i=1; i<=10; i++) {
		
		total = (numero * (+i));
		
		System.out.println(+numero+"x"+i+" = "+total);
	}
		

	
}
}

