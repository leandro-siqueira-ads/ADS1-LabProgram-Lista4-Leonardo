package lista4ex8;

import java.util.Scanner;

//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.  

public class lista4ex8 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
		int maior = 0;

		int idade;
		
		for (int i=1; i<=20; i++) {
		
			System.out.println("Digite 20 idades de pessoas: ");
			idade = entrada.nextInt();
						
			if (idade >= 18) {
				
				maior = maior + 1; 
							
			}
					
		}
			
		System.out.println("Sao maiores de idade a quantidade de: "+maior+" pessoas");
		
		}
}
