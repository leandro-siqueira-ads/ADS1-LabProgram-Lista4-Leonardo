package lista4ex11;

import java.util.Scanner;

//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8. 

public class lista4ex11 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		int numero;
		int aux = 0;	
		
	
for (int i=1; i<=20; i++) {
	
	System.out.println("Digite 20 numeros: ");
	numero = entrada.nextInt();
	
	if (numero > 8) {
		
		aux = aux + 1;
		
	}
	
	 

}
System.out.println("Total de numeros maiores do que 8: "+aux);
  
}

}
