import java.util.Scanner;

public class Questao3 {
	
	public static void limpaTela() {
		for (int aux = 1; aux <= 25; aux++);
		System.out.println();
	}

	public static int[] contaVogal(String frase) {
		char[] chars = frase.toLowerCase().toCharArray();
		//int totalConsoantes = 0, totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
		int dados[] = new int[7];
		
		for (int aux = 0; aux < frase.length(); aux++) {
			switch (chars[aux]) {
			case 'a': dados[0]++;
			break;
			
			case 'e': dados[1]++;
			break;
			
			case 'i': dados[2]++;
			break;
			
			case 'o': dados[3]++;
			break;
			
			case 'u': dados[4]++;
			break;

			default:
				System.out.println("O restante é consoante ou vogal repetida!!!!");
			}
		}
		return dados;
		
	}
	
	public static int somaVogal(int dados[]) {
		int totalVogal = 0;
		
		totalVogal = dados[0] + dados[1] + dados[2] + dados[3] + dados[4];
		
		return totalVogal;
	}
	public static void main(String[] args) {
		int dados[] = new int[7];
		Scanner in = new Scanner(System.in);
		String frase;
		
		System.out.println("Digite uma frase:");
		frase = in.nextLine();
		
		dados = contaVogal(frase);
		dados[6] = somaVogal(dados);
		
		for(int i:dados) {
			System.out.println(dados[i]);
		}
	}

}
