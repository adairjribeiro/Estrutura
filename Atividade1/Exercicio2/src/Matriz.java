import java.util.Random;

public class Matriz {

	public static int[][] gerar(int linhas, int colunas) {
		int [][]m = new int[linhas][colunas];
		Random gerador = new Random();
		
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				
				m[i][j] = gerador.nextInt(500);
				
				
			}
		}
		
		
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				
				if (m[i][j]>maiorValor) maiorValor=m[i][j];
				System.out.println();
				if (m[i][j]<menorValor) menorValor=m[i][j];
				System.out.println();
				System.out.println();
				
			}
			
			System.out.println("O maior valoe é: " + maiorValor);
			System.out.println("O maior valoe é: " + menorValor);
			
		}
		
		return m;
	}
	
	public static void mostrar(int [][]matriz) {
		for (int linha = 0; linha < matriz.length; linha++ ) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna] + "	" );
			}
			System.out.println();
		}
		
	}
}
