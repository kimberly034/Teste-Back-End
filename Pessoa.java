import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private Long id;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa(Long id, String nome, String cpf) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF obrigatório");
        }

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public List<Endereco> getEnderecos() { return enderecos; }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    @Override
    public String toString() {
        return "Pessoa{id=" + id + ", nome='" + nome + "', cpf='" + cpf + "'}";
    }
}