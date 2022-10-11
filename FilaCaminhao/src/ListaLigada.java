public class ListaLigada {
	
	private Caminhao primeiro;
	private Caminhao ultimo;
	private int tamanho;
	    
	 public ListaLigada(){
	        this.tamanho = 0;
	    }

	    public Caminhao getPrimeiro() {
	        return primeiro;
	    }

	    public void setPrimeiro(Caminhao primeiro) {
	        this.primeiro = primeiro;
	    }

	    public Caminhao getUltimo() {
	        return ultimo;
	    }

	    public void setUltimo(Caminhao ultimo) {
	        this.ultimo = ultimo;
	    }

	    public int getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(int tamanho) {
	        this.tamanho = tamanho;
	    }
	    
	    public void adicionar(String novoValor){
	    	Caminhao novoCaminhao = new Caminhao(novoValor);
	        if (this.primeiro == null && this.ultimo == null){
	            this.primeiro = novoCaminhao;
	            this.ultimo = novoCaminhao;            
	        }else{
	            this.ultimo.setProximo(novoCaminhao);
	            this.ultimo = novoCaminhao;            
	        }
	        this.tamanho++;
	    }
	    
	    public void remover(String valorProcurado){
	    	Caminhao anterior = null;
	    	Caminhao atual = this.primeiro;
	        for(int i=0; i < this.getTamanho(); i++){            
	            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
	                if (this.tamanho == 1){
	                    this.primeiro = null;
	                    this.ultimo = null;
	                }else if (atual == primeiro){
	                    this.primeiro = atual.getProximo();
	                    atual.setProximo(null);
	                }else if (atual == ultimo){
	                    this.ultimo = anterior;
	                    anterior.setProximo(null);
	                }else{
	                    anterior.setProximo(atual.getProximo());
	                    atual = null;
	                }
	                this.tamanho--;
	                break;
	            }
	            anterior = atual;
	            atual = atual.getProximo();
	        }
	    }
	    
	    public Caminhao get(int posicao){
	    	Caminhao atual = this.primeiro;
	        for(int i=0; i < posicao; i++){
	            if (atual.getProximo() != null){
	                atual = atual.getProximo();
	            }
	        }
	        return atual;
	    }

}
