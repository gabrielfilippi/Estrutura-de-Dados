package Functions;

import java.util.List;

import br.com.univille.trabalho.app.Produto;

public class SearchProductByComboBox {

	// MAIS VENDIDOS
	public static int searchMaisVendidos(List<Produto> vetor, int inicio, int fim) {
		Produto pivo = vetor.get(inicio);
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor.get(i).getQuantidadeDeVendas() >= pivo.getQuantidadeDeVendas()) {
				i++;
			} else if (pivo.getQuantidadeDeVendas() > vetor.get(f).getQuantidadeDeVendas()) {
				f--;
			} else {

				Produto troca = vetor.get(i);
				vetor.set(i, vetor.get(f));
				vetor.set(f, troca);

				i++;
				f--;
			}
		}
		vetor.set(inicio, vetor.get(f));
		vetor.set(f, pivo);

		return f;
	}

	// MENOR PRECO
	public static int searchMenorPreco(List<Produto> vetor, int inicio, int fim) {
		Produto pivo = vetor.get(inicio);
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor.get(i).getPreco() <= pivo.getPreco()) {
				i++;
			} else if (pivo.getPreco() < vetor.get(f).getPreco()) {
				f--;
			} else {

				Produto troca = vetor.get(i);
				vetor.set(i, vetor.get(f));
				vetor.set(f, troca);

				i++;
				f--;
			}
		}
		vetor.set(inicio, vetor.get(f));
		vetor.set(f, pivo);

		return f;
	}

	// MAIOR PRECO
	public static int searchMaiorPreco(List<Produto> vetor, int inicio, int fim) {
		Produto pivo = vetor.get(inicio);
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor.get(i).getPreco() >= pivo.getPreco()) {
				i++;
			} else if (pivo.getPreco() > vetor.get(f).getPreco()) {
				f--;
			} else {

				Produto troca = vetor.get(i);
				vetor.set(i, vetor.get(f));
				vetor.set(f, troca);

				i++;
				f--;
			}
		}
		vetor.set(inicio, vetor.get(f));
		vetor.set(f, pivo);

		return f;
	}

	// MELHOR AVALIADO
	public static int searchMelhorAvaliado(List<Produto> vetor, int inicio, int fim) {
		Produto pivo = vetor.get(inicio);
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor.get(i).getAvaliacao() >= pivo.getAvaliacao()) {
				i++;
			} else if (pivo.getAvaliacao() > vetor.get(f).getAvaliacao()) {
				f--;
			} else {

				Produto troca = vetor.get(i);
				vetor.set(i, vetor.get(f));
				vetor.set(f, troca);

				i++;
				f--;
			}
		}
		vetor.set(inicio, vetor.get(f));
		vetor.set(f, pivo);

		return f;
	}

	// MAIS NOVO (4)
	public static int searchMaisNovo(List<Produto> vetor, int inicio, int fim) {
		Produto pivo = vetor.get(inicio);
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor.get(i).getDataDeLancamento().getTime() >= pivo.getDataDeLancamento().getTime()) {
				i++;
			} else if (pivo.getDataDeLancamento().getTime() > vetor.get(f).getDataDeLancamento().getTime()) {
				f--;
			} else {

				Produto troca = vetor.get(i);
				vetor.set(i, vetor.get(f));
				vetor.set(f, troca);

				i++;
				f--;
			}
		}
		vetor.set(inicio, vetor.get(f));
		vetor.set(f, pivo);

		return f;
	}

}
