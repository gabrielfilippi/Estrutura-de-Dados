package br.univille.estd.bubblesort;

import java.util.Arrays;

public class BubbleSort {


	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira crescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio01(int vetor[]) {
		
		for(int i = 0; i<vetor.length; i++){
	        for(int j = 0; j<vetor.length-1; j++){
	            if(vetor[j] > vetor[j + 1]){
	                int aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
		
		
		return vetor;
	}

	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira decrescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio02(int vetor[]) {
		
		for(int i = 0; i<vetor.length; i++){
	        for(int j = 0; j<vetor.length-1; j++){
	            if(vetor[j] < vetor[j + 1]){
	                int aux = vetor[j];
	                vetor[j] = vetor[j+1];
	                vetor[j+1] = aux;
	            }
	        }
	    }
		
		return vetor;
	}

	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de String de maneira crescente
	 * Deve retornar o vetor ordenado.
	 * Confira o método String.compare()
	 */
	public static String[] exercicio03(String vetor[]) {
		int tamanho = vetor.length;

	    for (int i = 0; i < tamanho - 1; i++) {
	        for (int j = 0; j < tamanho - 1 - i; j++) {
	        	if(vetor[j].compareTo(vetor[ j+1 ])>0) {
	                String auxiliar = vetor[j];
	                vetor[j] = vetor[j + 1];
	                vetor[j + 1] = auxiliar;
	            }
	        }
	    }
	    
	    return vetor;
	}

	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de Produtos de maneira crescente, em relacao ao preço
	 * Deve retornar o vetor ordenado.
	 */
	
	public static Produto[] exercicio04(Produto vetor[]) {
        Produto aux;
       
        for(int i = 0; i<vetor.length; i++){
            for(int j = 0; j<(vetor.length - 1); j++){
                if(vetor[j].getValor() > vetor[j + 1].getValor()){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }
	
	
	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de Produtos de maneira crescente, em relacao ao nome
	 * Deve retornar o vetor ordenado.
	 */
	public static Produto[] exercicio05(Produto vetor[]) {
        Produto aux;
       
        for(int i = 0; i<vetor.length; i++){
            for(int j = 0; j<(vetor.length - 1); j++){
                if(vetor[j].getNome().compareTo(vetor[j + 1].getNome())>0){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }


}
