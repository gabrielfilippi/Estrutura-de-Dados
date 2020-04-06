package br.univille.estd.arranjos;

public class teste {

	public static void main(String[] args) {
		
		int vetor[] = {4, 3, 2, 1, 0};

		//(depois de adicionar os números no vetor...)

		int vetorRetornado[] = new int[5];
		int initial = 0;
		for(int i=vetor.length-1; i>=0 ;i--){
			vetorRetornado[initial] = vetor[i];
			initial++;
		}
		
		for(int i =0; i< vetorRetornado.length;i++) {
			System.out.println(vetorRetornado[i]);
		}
		
	}

	
}
