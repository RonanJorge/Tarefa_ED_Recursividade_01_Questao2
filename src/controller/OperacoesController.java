package controller;

public class OperacoesController {
	public OperacoesController() {
		super();
	}
	public int qtde_neg(int[] vetor, int tamanho) {
		if(tamanho == 0) {
			return 0;
		}else {
			int valor = vetor[tamanho - 1];
			if(valor < 0) {
				return 1 + qtde_neg(vetor, tamanho - 1);
			}else {
				return qtde_neg(vetor, tamanho - 1);
			}
		}
	}
}
