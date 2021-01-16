
public class ListaLigadaGenerico<T> {

    private ElementoGenerico<T> primeiro;
    private ElementoGenerico<T> ultimo;
    private int tamanho;

    public ListaLigadaGenerico() {
        this.tamanho = 0;
    }

    public ElementoGenerico<T> getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(ElementoGenerico<T> primeiro) {
        this.primeiro = primeiro;
    }

    public ElementoGenerico<T> getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(ElementoGenerico<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int tamanho() {
        return this.tamanho;
    }


    public void adiciona(T valor) {
        ElementoGenerico<T> elemento = new ElementoGenerico<T>(valor);

        if(this.primeiro == null && ultimo == null) {
            this.primeiro = elemento;
            this.ultimo = elemento;
            this.tamanho++;
        } else {
            this.ultimo.setProximo(elemento);
            this.ultimo = elemento;
            tamanho++;
        }
    }

    public void remover(T valor) {
        ElementoGenerico<T> anterior = null;
        ElementoGenerico<T> actual = primeiro;

        if(primeiro == null) return;

        if(actual.getValor().equals(valor)) {
            this.primeiro = actual.getProximo();
            actual.setProximo(null);
            tamanho--;
            return;
        }

        for(int i=0; i<tamanho; i++) {
            if(actual.getValor().equals(valor)) {

               if(actual == ultimo) {
                   this.ultimo = anterior;
                   anterior.setProximo(null);
               }else {
                   anterior.setProximo(actual.getProximo());
                   actual = null;
               }
                
               tamanho--;
               break;
            }
            anterior = actual;
            actual = actual.getProximo();
        }
    }

    public ElementoGenerico<T> get(int posicao) {

        ElementoGenerico<T> actual = primeiro;

        for(int i=0; i < posicao; i++) {
                
            if(actual.getProximo() != null) 
                actual = actual.getProximo();
        }
        return actual;
    }

    @Override
    public String toString() {
        String s = "[";

        ElementoGenerico<T> actual = primeiro;

        for(int i=0; i < tamanho; i++) {
            s += actual.getValor();
            
            if(i != tamanho-1)
                s+=", ";
                
            if(actual.getProximo() != null) 
                actual = actual.getProximo();
        }

        s +="]";

        return s;
    }
}