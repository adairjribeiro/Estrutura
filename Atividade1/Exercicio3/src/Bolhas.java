import java.util.Random;

public class Bolhas {
	
	public static void main(String[] args) {
		int vetor[];
		int aux;
		vetor = new int[50];
		
		Random numR = new Random();
		
		for(int i=0; i<50; i++){
		vetor[i]= numR.nextInt(999);}
		
		for(int i=0; i<50; i++){
			for(int j=0; j<49; j++){
				if(vetor[j]> vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		System.out.println("Vetor Ordenado");
		for(int i=0;i<50;i++){
			System.out.printf("%d\t",vetor[i]);}
		}

}
