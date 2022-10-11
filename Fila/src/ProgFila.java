public class ProgFila {

	public static void main(String[] args) {
		Fila f = new Fila();
		f.inserir("Meu caminho é cada manhã...");
		f.inserir("Meu destino não é de ninguém...");
		f.inserir("Eu não deixo meus passos no chão...");
		
		while (!f.vazia()) {
			System.out.println("Retirando da fila em ordem de entrada: " + f.retirar());
		}
	}

}
