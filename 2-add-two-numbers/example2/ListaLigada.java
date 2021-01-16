
public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return this.primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return this.ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int tamanho() {
        return this.tamanho;
    }


    public void adiciona(String valor) {
        Elemento elemento = new Elemento(valor);

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

    public void remover(String valor) {
        Elemento anterior = null;
        Elemento actual = primeiro;

        if(primeiro == null) return;

        if(actual.getValor().equalsIgnoreCase(valor)) {
            this.primeiro = actual.getProximo();
            actual.setProximo(null);
            tamanho--;
            return;
        }

        for(int i=0; i<tamanho; i++) {
            if(actual.getValor().equalsIgnoreCase(valor)) {

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

    public Elemento get(int posicao) {

        Elemento actual = primeiro;

        for(int i=0; i < posicao; i++) {
                
            if(actual.getProximo() != null) 
                actual = actual.getProximo();
        }
        return actual;
    }

    @Override
    public String toString() {
        String s = "[";

        Elemento actual = primeiro;

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