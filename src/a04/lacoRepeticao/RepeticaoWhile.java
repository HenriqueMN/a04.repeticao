package a04.lacoRepeticao;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		// EXEMPLO DE LAÇO DE REPETIÇÃO WHILE
		// !!!!! Para exemplos de FOR e DO...WHILE, vá para os respectivos arquivos RepeticaoFor e RepeticaoDo, nessa mesma pasta
		
		// Algoritmo que pede inputs ao usuário até que o valor entrado seja 0 e para cada valor e ao fim exibe o valor total da soma dos números pares que foram digitados e a quantidade de número ímpares que o usuário inseriu
		
		// Criação das variáveis e do Scanner
		int num, somaPar = 0, contImpar = 0;
		Scanner input = new Scanner(System.in);
		
		// Leitura do primeiro número
		System.out.print("Digite um número (insira 0 para parar): ");
		num = input.nextInt();
		
		// While loop
		
		while(num != 0) {
			if(num%2 == 0) {
				somaPar += num;
			}else {
				contImpar++;
			}
			
			// Leitura de um novo número
			System.out.print("Digite um número (insira 0 para parar): ");
			num = input.nextInt();
		}
		
		// Output
		System.out.print("\nSoma dos números pares: " + somaPar + "\n" + 
						"Quantidade de números ímpares: " + contImpar);

	}

}
