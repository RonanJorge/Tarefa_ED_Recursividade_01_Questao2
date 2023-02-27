package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int qtde_neg(int[] vetor, int tamanho) {
		/* O ponto de parada será quando o tamanho do vetor for zero, retornando 
		 * o valor zero para a função*/
		if(tamanho == 0) {
			return 0;
		}else {
			/* Faremos a função percorrer todo o vetor com a variável valor 
			* como sendo o último elemento do vetor.
		 	* Para isso, variável tamanho será decrescida de uma unidade 
		 	* a cada chamada da função. 
		 	* Quando valor for negativo, somamos 1 a função que retornará.
		 	* Caso contrário, só retornamos a própria função.*/
			int valor = vetor[tamanho - 1];
			if(valor < 0) {
				return 1 + qtde_neg(vetor, tamanho - 1);
			}else {
				return qtde_neg(vetor, tamanho - 1);
			}
		}
	}
}
