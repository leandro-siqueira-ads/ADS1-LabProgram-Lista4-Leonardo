package lista4ex4;

import java.util.Scanner;

//4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes. 

public class lista4ex4 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
			
		System.out.println("Digite o numero do usuario: ");
		int numero = entrada.nextInt();

		System.out.println("Digite o nome do usuario: ");
		String nome = entrada.next();

		
		for (int i=1; i<=numero; i++) {
			
						
			System.out.println(nome);
		}
						
	}

}
	


