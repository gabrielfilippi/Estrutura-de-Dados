package br.univille.estd.recursao;

 

public class Recursao {
    
    
    /**
     * Desenvolva o algoritmo de Fatorial Iterativa
     * @param x
     */
    public static long exercicio01(long x) {
        long acumulador = 1;
        for(long cont = 1; cont <= x; cont++){
            acumulador = acumulador * cont;
        }
        return acumulador;
    }
    
    /**
     * Desenvolva o algoritmo de Fatorial Recursiva
     * @param x
     */
    public static long exercicio02(long x) {
        
         long fat = 0;

 

         if (x <= 1){
             return x;
         }else{

 

             return fat= x * exercicio02(x - 1);
         }

 

    }
    
    /**
     * Desenvolva um algoritmo para somar os elementos de um vetor
     * de maneira iterativo.
     * Retorne a soma
     * @param x
     */
    public static int exercicio03(int vetor[]) {
        
        int acumulador = 0;
        for(int x = 0; x < vetor.length; x++){
            acumulador = acumulador + vetor[x];
        }
        return acumulador;
    }
    
    /**
     * Desenvolva um algoritmo para somar os elementos de um vetor
     * de maneira recursiva.
     * Retorne a soma
     * @param vetor[]
     * @param posicao do arranjo
     */
    public static int exercicio04(int vetor[], int posicao) {
        int soma = 0;
        if (posicao < vetor.length) {
            soma = vetor[posicao] + exercicio04(vetor, posicao + 1);
            return soma;
        } else {
            return 0;
        }
    }

 

    
    /**
     * Desenvolva um algoritmo para inverter os elementos de um vetor
     * de maneira iterativa.
     * Retorne o vetor
     * @param x
     */
    public static int[] exercicio05(int vetor[]) {    
            int temp;        
            for (int i = 0; i < vetor.length; i++) {
                for (int j = 0; j < i; j++) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }         
            return vetor;        
        }
    
    /**
     * Desenvolva um algoritmo para inverter os elementos de um vetor
     * de maneira recursiva.
     * Retorne o vetor
     * @param x
     */
    public static int[] exercicio06(int vetor[], int i, int j) {
        int aux = vetor[i];
        if (i < j){
            vetor[i] = vetor[j];
            vetor[j] = aux;
            exercicio06(vetor, i + 1, j - 1);
            return vetor;
        }
        return vetor;
    }
   

}
 