package lista4ex9;

//9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova

import java.util.Scanner;

public class lista4ex9 {

public static void main(String[] args) {
		
	// Variaveis
    String[] nomes = new String[10];
    int[] idades = new int[10];
    int idadeMaisNova = 99;
    String nomeDaPessoaMaisNova = "";
    
    Scanner scan = new Scanner(System.in);
    
    // Entrada dos dados
    for (int i = 0; i < 10; i++) {
        System.out.println("Digite o nome: ");
        nomes[i] = scan.next();
        System.out.println("Digite a idade:");
        idades[i] = scan.nextInt();
    }
    // Extraindo os idades e nomes da menor idade
    for (int i = 0; i < 3; i++) {
        if (idades[i] < idadeMaisNova) {
            idadeMaisNova = idades[i];
            nomeDaPessoaMaisNova = nomes[i];
        }
    
        
    }
    // Exibindo os resultados
    System.out.println("Pessoa Mais nova Nome: " + nomeDaPessoaMaisNova);
    System.out.println("Pessoa Mais nova Idade: " + idadeMaisNova);
    
}
}

