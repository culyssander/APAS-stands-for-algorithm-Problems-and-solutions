
public class ElementoGenerico<T> {

    private T valor;
    private ElementoGenerico<T> proximo;

    public ElementoGenerico(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return this.valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public ElementoGenerico<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(ElementoGenerico<T> proximo) {
        this.proximo = proximo;
    }

}