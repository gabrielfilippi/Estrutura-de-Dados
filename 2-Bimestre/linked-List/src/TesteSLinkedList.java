import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class TesteSLinkedList {
	
	@Test
	public void testarListaVazia() {
		SLinkedList<Integer> list = new SLinkedList<>();

		assertEquals(0, list.size, "Lista vazia deve ter tamanho zero");
		assertEquals(true, list.isEmpty(), "Lista vazia isEmpty tem que retornar 0");
	}

	@Test
	public void adicionarUmElementoNaLista() {
		SLinkedList<Integer> list = new SLinkedList<>();

		list.addFirst(10);

		assertEquals(1, list.size, "Lista vazia deve ter tamanho zero");
		assertEquals(false, list.isEmpty(), "Lista vazia isEmpty tem que retornar 0");
	}

	@Test
	public void removerOUltimo() {

		SLinkedList<Integer> list = new SLinkedList<>();

		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		
		assertEquals(1, list.getLast(), "O last da lista deve ser o elemento 1");
		Integer elementoRemovido = list.removeLast();
		
		assertEquals(1, elementoRemovido, "Foi removido o elemento 1");
		assertEquals(2, list.getLast(), "O last da lista deve ser o elemento 2");
		assertEquals(3, list.size(), "O last da lista deve ser o elemento 2");

		SLinkedList<Integer> listaVazia = new SLinkedList<>();

		try {
			listaVazia.removeLast();
			fail("Tentou remover o ultimo elemento da lista vazia e nao lançou a excecao.");
		} catch (NoSuchElementException ignored) {
			
		} catch (Exception e) {
			fail("Tentou remover o ultimo elemento da lista vazia e lançou a exceçao errada.");
		}

	}
	
	@Test
	public void getValor() {
		SLinkedList<Integer> list = new SLinkedList<>();

		list.addFirst(1); //3
		list.addFirst(2); //2
		list.addFirst(3); //1
		list.addFirst(4); //0
		assertEquals(4, list.get(0), "O get(0) da lista deve ser o elemento 4");
		
	}
	
	@Test
	public void substituiValor() {
		SLinkedList<Integer> list = new SLinkedList<>();

		list.addFirst(1); //3
		list.addFirst(2); //2
		list.addFirst(3); //1
		list.addFirst(4); //0
		
		assertEquals(99, list.set(0, 99), "O set(0, 99) da lista deve ser o elemento 99");
	}
	
	@Test
	public void removeValor() {
		SLinkedList<Integer> list = new SLinkedList<>();

		list.addFirst(1); //3
		list.addFirst(2); //2
		list.addFirst(3); //1
		list.addFirst(4); //0
		
		assertEquals(true, list.remove(1), "O get(0) da lista deve ser o elemento 4");
	}

}
