import java.util.ArrayList;
import java.util.List;

public class PessoaService {

    private List<Pessoa> pessoas = new ArrayList<>();
    private Long contadorId = 1L;

    public Pessoa criar(String nome, String cpf) {

        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                throw new RuntimeException("CPF já cadastrado");
            }
        }

        Pessoa nova = new Pessoa(contadorId++, nome, cpf);
        pessoas.add(nova);
        return nova;
    }

    public List<Pessoa> listar() {
        return pessoas;
    }

    public Pessoa buscar(Long id) {
        for (Pessoa p : pessoas) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        throw new RuntimeException("Pessoa não encontrada");
    }

    public void deletar(Long id) {
        pessoas.removeIf(p -> p.getId().equals(id));
    }
}