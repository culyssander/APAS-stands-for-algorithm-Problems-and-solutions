
public class Teste {

    public static void main(String [] args) {

        ListaLigada lista = new ListaLigada();

        lista.remover("Ferreira");

        lista.adiciona("Quitumba");
        lista.adiciona("Culyssander");
        lista.adiciona("Cordeiro");
        lista.adiciona("Madalena");
        lista.adiciona("Ferreira");

        lista.adiciona("Quitumba");
        lista.adiciona("Culyssander");
        lista.adiciona("Cordeiro");
        lista.adiciona("Madalena");
        lista.adiciona("Ferreira");

        System.out.println(lista.tamanho());
        System.out.println(lista);

        System.out.println(lista.get(3).getValor());

        lista.remover("Ferreira");
        lista.remover("Ferreira");

        lista.adiciona("Ferreira");
        lista.adiciona("Ferreira");

        lista.remover("Ferreira");
        lista.remover("Ferreira");

        lista.remover("Quitumba");
        lista.remover("Culyssander");
        lista.remover("Cordeiro");
        lista.remover("Madalena");
        lista.remover("Ferreira");

        lista.remover("Quitumba");
        lista.remover("Culyssander");
        lista.remover("Cordeiro");
        lista.remover("Madalena");
        lista.remover("Ferreira");

        System.out.println(lista.tamanho());
        System.out.println(lista);

        lista.adiciona("Quitumba");

    }
}