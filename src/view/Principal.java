/*	Nome: Ronan Jorge
 * 	Data: 26/02/2023
 * 	Objetivo: 2) Crie uma função recursiva que exiba o total de elementos negativos
	de um vetor de inteiros, de N posições, passado como parâmetro:
 */

package view;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int[] vetor = {-1, -2, -3, -4, 5,-6, -7,-8,-9, -10};
		int tamanho = 10;
		System.out.println("Quantidade de números negativos: "+op.qtde_neg(vetor, tamanho));
	}

}
