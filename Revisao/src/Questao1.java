import java.util.Scanner;

public class Questao1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		float velocidadeMedia, tempoGasto, autonomiaCarro;
		float distancia, litrosCombustivel;
		
		System.out.print("Cálculo da quantidade de litros de combustível gasto em uma viagem.\n\n");
		
		System.out.print("Digite o tempo que você gastou em sua viagem (em horas): ");
		tempoGasto = in.nextFloat();
		
		System.out.print("Digite a velocidade média que você fez no percurso (em KM/H): ");
		velocidadeMedia = in.nextFloat();
		
		System.out.print("Digite a autonomia do seu veículo (em KM/L): ");
		autonomiaCarro = in.nextFloat();
		
		distancia = velocidadeMedia * tempoGasto;
		litrosCombustivel = distancia / autonomiaCarro;
		
		System.out.print("\n\nResultado: \n\n");
		System.out.print("Velocidade Média: " + velocidadeMedia + " KM/H\n");
		System.out.print("Tempo Gasto: " + tempoGasto + " horas\n");
		System.out.print("Distância Percorrida: " + distancia + " KM\n");
		System.out.print("Quantidade de Combustível Utilizado: " + litrosCombustivel + " litros\n");
		
		
		in.close();
	}
}
