/*	Nome: Ronan Jorge
 * 	Data: 26/02/2023
 * 	Objetivo: 2) Crie uma função recursiva que exiba o total de elementos negativos
	de um vetor de inteiros, de N posições, passado como parâmetro:
 */

package view;
import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de n: "));
		int[] vetor = new int[tamanho];
		for(int i = 0; i < tamanho; i++){
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento do vetor: "));
		}
		System.out.println("Quantidade de números negativos: "+op.qtde_neg(vetor, tamanho));
	}

}
