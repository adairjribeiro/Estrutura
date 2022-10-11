public class Caminhao {
	
	private String valor;
    private Caminhao proximo;
    
    public Caminhao(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Caminhao getProximo() {
        return proximo;
    }

    public void setProximo(Caminhao proximo) {
        this.proximo = proximo;
    }

}
