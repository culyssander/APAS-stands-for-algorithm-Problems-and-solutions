public class TesteGenerico {

    public static void main(String[]args) {
        ListaLigadaGenerico<Integer> numeros = new ListaLigadaGenerico<Integer>();

        numeros.adiciona(2);
        numeros.adiciona(4);
        numeros.adiciona(6);
        numeros.adiciona(8);
        numeros.adiciona(10);

        System.out.println(numeros);
        System.out.println("Tamanho do numero: " + numeros.tamanho());

        ListaLigadaGenerico<Cliente> clientes = new ListaLigadaGenerico<Cliente>();

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Quitumba";
        cliente1.email = "culyssandercentro@gmail.com";

        clientes.adiciona(cliente1);

        System.out.println(clientes);
        System.out.println("Tamanho de cliente: " + clientes.tamanho());

    }
}