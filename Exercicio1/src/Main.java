import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetor[];
		vetor = new int[10];
		Random numR = new Random();
		
		for(int i=0;i<vetor.length;i++){
			vetor[i]= numR.nextInt(999);
		}
		
		System.out.println("Vetor randômico:");
		for(int num:vetor)
			System.out.println(num);
		System.out.println();
		
		int num;
		System.out.println("Digite um valor para procurar no vetor: ");
        num = in.nextInt();
        System.out.println();
	        
	    for(int i=0;i<vetor.length;i++){
	            // se existir no vetor o número digitado
	         if(vetor[i] == num){
	            System.out.println("O índice do número digitado é " + i);
	            // se não existir...
	            } else if(i != vetor.length){
	                System.out.println("Número não encontrado no vetor");
	            }
		}

	}

}
