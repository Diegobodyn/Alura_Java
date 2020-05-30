package exercicios_diversos;

import java.util.Scanner;

/*************************************************************************
 *  1-)Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
 *  ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2.
 *
 *************************************************************************/

public class EstoqueMedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double quantidadeMinima;
		double quantidadeMaxima;
		double estoque_medio;
		
		System.out.println("Calculadora de estoque m�dio\n\n");
		
		System.out.println("Digite a quantidade m�nima: ");
		quantidadeMinima = entrada.nextDouble();
		
		System.out.println("Digite a quantidade m�xima: ");
		quantidadeMaxima = entrada.nextDouble();
		
		estoque_medio = (quantidadeMinima + quantidadeMaxima)/2;
		System.out.println("Estoque M�dio = "+estoque_medio+"\n");
		
		entrada.close();
			
		}
}
