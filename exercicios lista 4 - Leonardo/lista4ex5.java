package lista4ex5;


//5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. 


import java.util.Scanner;

public class lista4ex5 {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
	
		int soma = 0;

		
		for (int i=1; i<=10; i++) {
		
			System.out.println("Digite o numero do usuario: ");
			int numero = entrada.nextInt();
						
			soma = soma + numero;
			
			
		}
			
		System.out.println("Total = "+soma);
	}

}
