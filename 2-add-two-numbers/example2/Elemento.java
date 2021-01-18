
public class Elemento {

    private String valor;
    private Elemento proximo;

    public Elemento(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Elemento getProximo() {
        return this.proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
 
}