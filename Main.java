public class Main {

    public static void main(String[] args) {

        PessoaService service = new PessoaService();

        Pessoa p1 = service.criar("Maria", "123");
        Pessoa p2 = service.criar("João", "456");

        Endereco e1 = new Endereco(1L, "São Paulo", true);
        p1.adicionarEndereco(e1);

        System.out.println("Lista de pessoas:");
        for (Pessoa p : service.listar()) {
            System.out.println(p);
        }

        System.out.println("\nBuscar ID 1:");
        System.out.println(service.buscar(1L));

        service.deletar(2L);

        System.out.println("\nApós deletar João:");
        for (Pessoa p : service.listar()) {
            System.out.println(p);
        }
    }
}