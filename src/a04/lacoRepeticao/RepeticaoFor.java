package a04.lacoRepeticao;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		/*
		 * -----LAÇOS DE REPETIÇÃO
		 * 
		 * Laços de repetição, ou loops, são estruturas que permitem que um bloco de código se repita um n número de vezes.
		 * Em Java existem três tipos de laço de repetição:
		 * 
		 * * FOR:
		 * * * Estrutura geralmente utilizada para ter um maior controle sobre o loop quando se sabe a condição de parada/o número de vezes que o bloco de código deve ser executado.
		 * * * A estrutura FOR recebe três parâmetros, um VALOR INICIAL (deve ser um número inteiro), uma CONDIÇÃO LIMITE e uma EXPRESSÃO DE ATUALIZAÇÃO. No exemplo abaixo, a variável VAR começa com valor 0, tem como condição limite var < 5, isto é, assim que VAR fica com um valor maior ou igual a 5, o loop para, e tem como expressão de atualizar var++, que a cada loop acrescente 1 ao valor de var. Assim, o loop itera uma vez com VAR = 0, no fim do loop, VAR é atualizada como VAR = VAR + 1, o loop repete o processo até que VAR tenho um valor maior ou igual a 5. Exemplo:
		 * 
		 * * * for(int var = 0; var < 5; var++){[Bloco de código]}
		 * 
		 * * WHILE:
		 * * * Diferentemente do for, o while é comumente usado quando não se sabe o número de vezes que o loop deve executar o bloco de código.
		 * * * A estrutura while tem os mesmos parâmetros e a mesma lógica de for, mas se organiza de forma diferente e seu valor inicial deve ser criado e inicializado fora do loop. Exemplo:
		 * 
		 * * * int var = 0;
		 * * * while(var != 10){[Bloco de código] var++;}
		 * 
		 * * DO...WHILE:
		 * * * Funciona de forma similar ao while, tendo como diferença principal o fato de executar o bloco de código pelo menos umas vez antes de finalizar o loop. Assim, mesmo se VAR tiver o valor 10, que é a condição de parada do loop, o bloco de código será executado pelo menos uma vez. Exemplo
		 * 
		 * * * do{[Bloco de código] var++;} while(var != 10}
		 */
		
		// EXEMPLO DE LAÇO DE REPETIÇÃO FOR
		// !!!!! Para exemplos de WHILE e DO...WHILE, vá para os respectivos arquivos RepeticaoWhile e RepeticaoDo, nessa mesma pasta
		
		// Algoritmo que lê três notas de três alunes e retorna a média de cada um deles e a média geral dos três
	
		// Criação das variáveis
		float n1, n2, n3, somaMedia=0, media, mediaGeral;
		int i;
		Scanner input = new Scanner(System.in);
		
		//For loop
		
		for(i = 0; i < 3; i++) {
			
			// Leitura dos inputs
			System.out.print("Entre com a primeira nota: ");
			n1 = input.nextFloat();
			System.out.print("Entre com a segunda nota: ");
			n2 = input.nextFloat();
			System.out.print("Entre com a terceira nota: ");
			n3 = input.nextFloat();
			
			// Cálculo e exibição da média
			media = (n1+n2+n3)/3;
			System.out.printf("\nMédia do alune: %.2f \n-----\n", media);
			
			// Acréscimo da média atual à soma média para o cálculo da média geral
			somaMedia += media;
		}
		
		// Cálculo e exibição da média geral
		mediaGeral = somaMedia/3;
		System.out.printf("Média geral: %.2f", mediaGeral);
	}

}
