package lista4ex7;

//7) Leia a idade de 20 pessoas e exiba a média das idades. 

import java.util.Scanner;

public class lista4ex7 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
		int soma = 0;

		int idade, media;
		
		for (int i=1; i<=20; i++) {
		
			System.out.println("Digite 20 idades de usuarios: ");
			idade = entrada.nextInt();
						
			soma = (soma + idade);
			
		}
		
		
		media = (soma / 20);
		
		System.out.println("A media das idades e de: "+media+" anos");
		
	}
}
