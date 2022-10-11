import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ListaLigada listaCaminhao = new ListaLigada();
		
		String nome = null;
		//int tamanho;
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Digite o nome da Empresa(Caminhão): ");
			nome = in.nextLine();
			listaCaminhao.adicionar(nome);
		}
		
		System.out.println("****Lista Empresa(Caminhão)*****");
        for(int i=0; i < listaCaminhao.getTamanho(); i++){
            System.out.println(listaCaminhao.get(i).getValor());
        }
        
        for (int i=1; i<=10; i--) {
        	listaCaminhao.remover(nome);
        	if(i==0) {
        		System.out.println("Lista Empresa(Caminhão) VAZIA!");
        	}
        	in.close();
        }
	}

}
