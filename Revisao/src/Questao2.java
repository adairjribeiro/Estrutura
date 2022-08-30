import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a placa do carro: ");
		int placa = in.nextInt();
		
		System.out.println("Digite o ano de fabricação do carro: ");
		int ano = in.nextInt();
		
		if (ano <= 2010) {
			System.out.println("CARRO VELHO!!!!!!!!" + "Placa: " + placa);
		}
		else if (ano >= 2011 && ano <= 2021) {
			System.out.println("CARRO SEMI NOVO!!!!!!!!" + "Placa: " + placa);
		}
		else {
			System.out.println("CARRO NOVO!!!!!!!!" + "Placa: " + placa);
		}
		
		in.close();
	}

}
