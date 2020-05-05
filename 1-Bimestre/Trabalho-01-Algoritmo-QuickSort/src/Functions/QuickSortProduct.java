package Functions;

import java.util.List;

import br.com.univille.trabalho.app.Produto;

public class QuickSortProduct {

	public static void quickSort(List<Produto> vetor, int inicio, int fim, int positionComboBox) {
		if (inicio < fim) {
			int posicaoPivo = 0;
			if (positionComboBox == 0) {
				// Mais Vendidos
				posicaoPivo = SearchProductByComboBox.searchMaisVendidos(vetor, inicio, fim);
			} else if (positionComboBox == 1) {
				// Menor Preco
				posicaoPivo = SearchProductByComboBox.searchMenorPreco(vetor, inicio, fim);
			} else if (positionComboBox == 2) {
				// Maior Preco
				posicaoPivo = SearchProductByComboBox.searchMaiorPreco(vetor, inicio, fim);
			} else if (positionComboBox == 3) {
				// Melhor Avaliado
				posicaoPivo = SearchProductByComboBox.searchMelhorAvaliado(vetor, inicio, fim);
			} else if (positionComboBox == 4) {
				// Produtos mais novos
				posicaoPivo = SearchProductByComboBox.searchMaisNovo(vetor, inicio, fim);
			}

			quickSort(vetor, inicio, posicaoPivo - 1, positionComboBox);
			quickSort(vetor, posicaoPivo + 1, fim, positionComboBox);
		}
	}

}
