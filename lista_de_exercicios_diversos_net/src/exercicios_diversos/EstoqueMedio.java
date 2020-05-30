package exercicios_diversos;

import java.util.Scanner;

/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *************************************************************************/

public class EstoqueMedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double quantidadeMinima;
		double quantidadeMaxima;
		double estoque_medio;
		
		System.out.println("Calculadora de estoque médio\n\n");
		
		System.out.println("Digite a quantidade mínima: ");
		quantidadeMinima = entrada.nextDouble();
		
		System.out.println("Digite a quantidade máxima: ");
		quantidadeMaxima = entrada.nextDouble();
		
		estoque_medio = (quantidadeMinima + quantidadeMaxima)/2;
		System.out.println("Estoque Médio = "+estoque_medio+"\n");
		
		entrada.close();
			
		}
}
