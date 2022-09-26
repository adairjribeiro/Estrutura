import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner;
		Stack pilha = new Stack(); // Classe Pilha
		
        scanner = new Scanner(new File("./Nomes.txt"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());
        System.out.println("\n****10 Frases Mais buscadas Recentemente!*****");
       
        for(int i = 0; i < 10; i++) {
		        System.out.println(pilha.pop());
        }
      System.out.println("\n****Mais Frases*****");
       while(!pilha.empty()) {
          System.out.println(pilha.push("Marcha de Câmbio Automático"));
          System.out.println(pilha.push("Tipos de Vacinas"));
         break;
		    }
    }
}