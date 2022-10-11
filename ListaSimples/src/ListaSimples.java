public class ListaSimples {
	
	No inicio = null;
	int tamanho = 0;
	
	public void inserirInicio(String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
		inicio = no;
		tamanho++;
	}
	
	public String retirarInicio() {
		if (inicio == null) {
			return null;
		}
		String info = inicio.info;
		inicio = inicio.proximo;
		tamanho--;
		return info;
	}

	public void inserirFim(String info) {
		No no = new No();
		no.info = info;
		if (inicio == null) {
			no.proximo = null;
			inicio = no;
		} else {
			No local = inicio;
			while (local.proximo != null) {
				local = local.proximo;
			}
			local.proximo = no;
			no.proximo = null;
		}
		tamanho++;
	}
	
	public String retirarFim() {
		if (inicio == null) {
			return null;
		}
		No local = inicio;
		while (local.proximo != null) {
			No aux = local;
			local = local.proximo;
			if (local.proximo == null) {
				aux.proximo = null;
				tamanho--;
				return local.info;
			}
		}
		inicio = null;
		tamanho--;
		return local.info;
		
	}
	
	public void inserirIndice(int indice, String info) {
		if (indice <= 0) {
			inserirInicio(info);
		} else if (indice >= tamanho) {
			inserirFim(info);
		} else {
			No local = inicio;
			for (int i = 0; i < indice - 1; i++) {
				local = local.proximo;
			}
			No no = new No();
			no.info = info;
			no.proximo = local.proximo;
			local.proximo = no;
			tamanho++;
		}
	}
	
	public String retirarIndice(int indice) {
		if (indice < 0 || indice >= tamanho || inicio == null) {
			return null;
		} else if (indice == 0) {
			return retirarInicio();
		} else if (indice == tamanho -1){
			return retirarFim();
		}
		No local = inicio;
		for (int i = 0; i < indice - 1; i++) {
			local = local.proximo;
		}
		String info = local.proximo.info;
		local.proximo = local.proximo.proximo;
		tamanho--;
		return info;
	}
	
	public String toString() {
		String str = "(" + tamanho + ") ";
		No local = inicio;
		while (local != null) {
			str += local.info + " ";
			local = local.proximo;
		}
		return str;
	}
	
	public static void main(String [] args) {
		ListaSimples l = new ListaSimples();
		System.out.println(l);
		l.inserirInicio("Lua bonita...");
		System.out.println(l);
		l.inserirInicio("me trás aborrecimento...");
		System.out.println(l);
		l.inserirInicio("Ver são Jorge no jumento...");
		System.out.println(l);
		
		while (l.retirarInicio() != null) {
			System.out.println("Retirando do início da lista: " + l);
		}
		
		System.out.println(l);
		l.inserirFim("Lua bonita...");
		System.out.println(l);
		l.inserirFim("me trás aborrecimento...");
		System.out.println(l);
		l.inserirFim("Ver são Jorge no jumento...");
		System.out.println(l);
		
		while (l.retirarFim() != null) {
			System.out.println("Retirando do fim da lista: " + l);
		}
		
		System.out.println(l);
		l.inserirIndice(0, "Lua bonita...");
		System.out.println(l);
		l.inserirIndice(1, "me trás aborrecimento...");
		System.out.println(l);
		l.inserirIndice(2, "Ver são Jorge no jumento...");
		System.out.println(l);
		System.out.println("Retirando no meio da lista: " + l.retirarIndice(1));
		System.out.println(l);
	}
}
