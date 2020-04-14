package br.univille.estd.selectionsort;


public class SelectionSort {


	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira crescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio01(int vetor[]) {
		
		for (int i = 0; i < vetor.length - 1; i++) {  
            int index = i;  
            for (int j = i + 1; j < vetor.length; j++){  
                if (vetor[j] < vetor[index]){  
                    index = j; //searching for lowest index  
                }  
            }  
            int menorValor = vetor[index];   
            vetor[index] = vetor[i];  
            vetor[i] = menorValor;  
        } 
		
		
		return vetor;
	}

	/**
	 * Desenvolva o algoritmo da bolha que ordene
	 * um vetor de inteiro de maneira decrescente
	 * Deve retornar o vetor ordenado
	 */
	public static int[] exercicio02(int vetor[]) {
		
        for (int i= vetor.length - 1; i > 0; i--){
        	int first = 0;
        	for (int j=1; j<=i; j++){
        		if (vetor[j] < vetor[first]) {
        			first = j;
        		}
        	}
        	int temp = vetor[first];
        	vetor[first] = vetor[i];
        	vetor[i] = temp;
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
		
		for (int i = 0; i < vetor.length - 1; i++) {  
			
            int index = i;  
            for (int j = i + 1; j < vetor.length; j++){  
            	if(vetor[j].compareTo(vetor[ index ])<0) {
                    index = j; //searching for lowest index  
                }  
            } 
            
            String menorValor = vetor[index];   
            vetor[index] = vetor[i];  
            vetor[i] = menorValor;
            
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
        	int index = i;
            for(int j = 0; j<(vetor.length - 1); j++){
                if(vetor[j].getValor() > vetor[j + 1].getValor()){
                    index = j;
                }
            }
            aux = vetor[index];
            vetor[index] = vetor[index+1];
            vetor[index+1] = aux;
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
	       
        for (int i = 0; i < vetor.length - 1; i++) {  
			
            int index = i;  
            for (int j = i + 1; j < vetor.length; j++){  
                if(vetor[j].getNome().compareTo(vetor[index].getNome())<0){
                	index = j; //searching for lowest index 
                }
            }
            aux = vetor[index];   
            vetor[index] = vetor[i];  
            vetor[i] = aux;
        }
        return vetor;
        
    }


}
