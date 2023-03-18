package lista4ex3;

import java.util.Scanner;

//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 


public class lista4ex3 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
			
		System.out.println("Digite o nome do usuario: ");
		String usuario = entrada.next();
		
		
		for (int i=1; i<=10; i++) {
			
						
			System.out.println(usuario);
		}
						
	}

}
	
