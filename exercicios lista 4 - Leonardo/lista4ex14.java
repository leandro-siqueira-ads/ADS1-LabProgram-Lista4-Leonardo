package lista4ex14;

import java.util.Scanner;

//*14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100
//, quantos estão entre 101 e 200 e quantos são maiores de 200.


public class lista4ex14 {

public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);	
		
		int numero;
		int aux0e100 = 0;	
		int aux101e200 = 0;
		int aux200 = 0;
		
	
for (int i=1; i<=20; i++) {
	
	System.out.println("Digite 20 numeros: ");
	numero = entrada.nextInt();
	
	if (numero >= 0 && numero <= 100) {
		
		aux0e100 = aux0e100 + 1;
	}	
	if (numero >=101 && numero <=200) {
		
		aux101e200 = aux101e200 + 1;
	}
		
	if (numero >=200) {
		
		aux200 = aux200 + 1;
	}
	

}
System.out.println("Total de numeros que estao entre 0 e 100: "+aux0e100);
System.out.println("Total de numeros que estao entre 101 e 200: "+aux101e200);
System.out.println("Total de numeros maiores do que 200: "+aux200); 
  
}
}
