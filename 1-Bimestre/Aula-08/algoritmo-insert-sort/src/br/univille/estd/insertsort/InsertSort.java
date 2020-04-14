package br.univille.estd.insertsort;

public class InsertSort {


	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira crescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio01(int vetor[]) {
		
        for (int j = 1; j < vetor.length; j++) {  
            int key = vetor[j];  
            int i = j-1;  
            while ( (i > -1) && ( vetor [i] > key ) ) {  
            	vetor [i+1] = vetor [i];  
                i--;  
            }  
            vetor[i+1] = key;  
        } 
        
		return vetor;
	}

	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira decrescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio02(int vetor[]) {
		
		for (int j = 1; j < vetor.length; j++) {
            int key = vetor[j];
            int i = j-1;
            while ( (i > -1) && ( vetor [i] < key ) ) {
                vetor [i+1] = vetor [i];
                i--;
            }
            vetor[i+1] = key;
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
	    
		for (int j = 1; j < vetor.length; j++) {
		    String key = vetor[j];
		    int i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(vetor[i]) > 0) {
		        break;
		      }
		      vetor[i + 1] = vetor[i];
		      i--;
		    }
		    vetor[i + 1] = key; 
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
		
        for (int j = 1; j < vetor.length; j++) {  
        	aux = vetor[j];  
            int i = j-1;
            while ( (i > -1) && ( vetor[i].getValor() > aux.getValor() ) ) {
            	vetor[i+1] = vetor[i];  
                i--;  
            }  
            vetor[i+1] = aux;  
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
		
		for (int j = 1; j < vetor.length; j++) {
			aux = vetor[j];
		    int i = j - 1;
		    while (i >= 0) {
		    	if(aux.getNome().compareTo(vetor[i].getNome())>0){
		    		break;
		    	}
		    	vetor[i + 1] = vetor[i];
		    	i--;
		    }
		    vetor[i + 1] = aux; 
		}
		return vetor;
      
    }


}
