package a04.lacoRepeticao;

import java.util.Scanner;

public class RepeticaoDo {

	public static void main(String[] args) {
		
		// EXEMPLO DE LAÇO DE REPETIÇÃO DO...WHILE
		// !!!!! Para exemplos de FOR e WHILE, vá para os respectivos arquivos RepeticaoFor e RepeticaoWhile, nessa mesma pasta
		
		// Algoritmo em que o usuário digita uma tabuada e o programa retorna a tabuada do número para ele
		
		// Criação das variáveis e Scanner
		int tabuada, resultado, x=1;
		Scanner input = new Scanner(System.in);
		
		// Leitura do input
		System.out.print("Digite o número da tabuada que você quer visualizar: ");
		tabuada = input.nextInt();
		
		// Loop Do...While e exibição da tabuada
		System.out.println("\nTabuada do " + tabuada + ": "); // Cabeçalho da tabuada
		do {
			resultado = tabuada * x;
			System.out.println(tabuada + " * " + x + " = " + resultado);
			x++;
		}while(x <= 10);
		

	}

}
