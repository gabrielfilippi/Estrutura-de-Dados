
public class Main {
	
	public static void main(String[] args) {
		
		int[] vetor = {10, 0, 40, 5, 1};
		
		Functions.quickSort(vetor,0,vetor.length-1);
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}
	
}
