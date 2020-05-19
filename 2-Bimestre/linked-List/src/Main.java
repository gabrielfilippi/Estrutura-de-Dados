
public class Main {
	public static void main(String[] args) {
	
		
		SLinkedList<String> list = new SLinkedList<String>();
		
		list.addFirst("A"); //3
		list.addFirst("B"); //2
		list.addFirst("C"); //1
		list.addFirst("D"); //0
		
		System.out.println(list.get(0));
		list.remove("A");
		System.out.println();
		
		
		
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));
		
		
		
		
		
	}
}
