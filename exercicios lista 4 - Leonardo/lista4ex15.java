package lista4ex15;

import java.util.Scanner;

//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números.
//Encerre a execução quando um número negativo for digitado.

public class lista4ex15 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		int numero = 0;
		int aux = 0;
	

	for (int i=1; i<=20; i++) {
	
	System.out.println("Digite 20 numeros: ");
	numero = entrada.nextInt();
	
	if (numero > 0) {
				
		aux = aux + numero;

		
	}
	if (numero <0) {
		i=20;
		System.out.println("Fim do programa");
		
	}
	}
	System.out.println("Soma dos numeros digitados: "+aux);
	}
	}


