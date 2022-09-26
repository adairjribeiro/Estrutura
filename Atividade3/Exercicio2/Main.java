import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


class Main {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
		  
	        pq.add("Ingresso 01");
	        pq.add("Ingresso 02");
	        pq.add("Ingresso 03");
	        pq.add("Ingresso 04");
	        pq.add("Ingresso 05");
          pq.add("Ingresso 06");
	        pq.add("Ingresso 07");
	        pq.add("Ingresso 08");
	        pq.add("Ingresso 09");
	        pq.add("Ingresso 10");
          pq.add("Ingresso 11");

	        System.out.println(pq);
	        
	        System.out.println("\n***Entrada VIP***");
    
	        for(int i = 0; i < 10; i++) {
	          System.out.print(pq.remove() + "\n");
          }
    
          System.out.print("\nPessoa de Sorteada para conhecer a banda: ");
          System.out.print(Math.random() + "\n");  
  }
}