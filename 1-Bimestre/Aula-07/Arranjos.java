package br.univille.estd.arranjos;


/**
 * Lista de ExercÃ­cios
 * Alterem este arquivo
 */
public class Arranjos {
	
	/**
	 * Retorne o valor 0
	 * @return
	 */
	public static int exercicio00() {
		return 0;
	}
	
	/**
	 * Crie um arranjo de inteiros de 3 posicoes, com valores zeros
	 * e retorne por parametro
	 * @return
	 */
	public static int[] exercicio01() {
		int vetor[] = {0,0,0};
		return vetor;
	}
	
	/**
	 * Crie um arranjo de Strings de 3 posicoes com os valores "aa","bb" e "cc"
	 * e retorne por parametro
	 */
	public static String[] exercicio02() {
		String[] vetor = {"aa","bb","cc"};
        return vetor;
	}
	
	/**
	 * Retorne o tamanho do vetor
	 */
	public static int exercicio03(int[] vetor) {
		return vetor.length;
	}
	
	/**
	 * Retorne o elemento da posicao 4
	 */
	public static int exercicio04(int[] vetor) {
		return vetor[4];
	}
	
	/**
	 * Modifique todas as posicoes do vetor para o valor -1
	 * Retorne o vetor modificado
	 */
	public static int[] exercicio05(int[] vetor) {
		for (int i = 0; i < vetor.length; i++){
		    vetor[i] = -1;
		}
		return vetor;
	}
	
	/**
	 * Some os valores contidos no arranjo e retorne o total
	 */
	public static int exercicio06(int[] vetor) {
		int total=0;
		for(int i=0; i<vetor.length; i++) {
			total+=vetor[i];
		}
		return total;
	}
	
	/**
	 * Conte os numeros impares contidos no arranjo e retorne o total
	 */
	public static int exercicio07(int[] vetor) {
        int impar = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i]%2 != 0) {
                impar ++;
            }
        }
        return impar;
    }
	
	/**
	 * Copie os valores do vetor A para o Vetor B. Retorne o vetor modificado B
	 * Os vetores A e B sempre terao o mesmo tamanho
	 */
	public static int[] exercicio08(int[] vetorA, int[] vetorB) {
	
		for(int i=0; i<vetorA.length; i++) {
			vetorB[i] = vetorA[i];
		}
		return vetorB;
	}
	
	/**
	 * Retorne um vetor com os elementos na ordem inversa do vetor recebido por parametro
	 * Exemplo: Vetor recebido  3, 5, 6
	 * Retorno: Vetor retornado 6, 5, 3
	 */
	public static int[] exercicio09(int[] vetor) {
		int vetorRetornado[] = new int[vetor.length];
		int initial = 0;
		
		for(int i=vetor.length-1; i>=0 ;i--){
			vetorRetornado[initial] = vetor[i];
			initial++;
		}
	
		return vetorRetornado;
	}
	
	/**
	 * Pesquise no vetor recebido por parametro, a posicao do elemento recebido por parametro.
	 * Retorne a posicao.
	 * Exemplo: Vetor recebido  3, 5, 6
	 *          Elemento 5
	 * Retorno: A posicao do elemento 5 Ã© 1
	 * Se o elemento nao existir no vetor retorne -1
	 */
	 public static int exercicio10(int[] vetor, int elemento) {
        int posicao = 0;
        int i = 0;
        boolean existe = false;
        while (i < vetor.length) {
            if (vetor[i] == elemento) {
                posicao = i;
                existe = true;
                break;
            }
            else{
                i++;
            }
            
        }
        if(existe == false) {
            posicao = -1;
        }
        
        return posicao;
	 }

}
