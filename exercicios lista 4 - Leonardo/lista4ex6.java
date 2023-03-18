package lista4ex6;
 

 //6) Leia a idade de 20 pessoas e exiba a soma das idades. 

import java.util.Scanner;

public class lista4ex6 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
		int soma = 0;

		
		for (int i=1; i<=20; i++) {
		
			System.out.println("Digite o numero do usuario: ");
			int idade = entrada.nextInt();
						
			soma = soma + idade;
			
			
		}
			
		System.out.println("Soma Total das idades e de = "+soma+" anos");
	}
}
