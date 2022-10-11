public class Fila {
	No cabeca;
	No inicio;
	int tamanho;
	
	Fila() {
		cabeca = null;
		inicio = null;
		tamanho = 0;
	}

	String verificaCabeca() {
		if (cabeca == null) {
			return null;
		}
		return cabeca.info;
	}
	
	boolean vazia() {
		return tamanho == 0;
	}
	
	void inserir(String info) {
		No no = new No();
		no.info = info;
		no.proximo = inicio;
		inicio = no;
		if(tamanho == 0) {
			cabeca = no;
		}
		tamanho++;
	}
	
	String retirar() {
		if (vazia()) {
			return null;
		}
		
		String info = cabeca.info;
		if (tamanho == 1) {
			inicio = null;
			cabeca = null;
		} else {
			No local = inicio;
			while (local.proximo != cabeca) {
				local = local.proximo;
			}
			
			cabeca = local;
			cabeca.proximo = null;
		}
		tamanho--;
		return info;
	}
}

