public class Endereco {

    private Long id;
    private String cidade;
    private boolean principal;

    public Endereco(Long id, String cidade, boolean principal) {
        this.id = id;
        this.cidade = cidade;
        this.principal = principal;
    }

    public Long getId() { return id; }
    public String getCidade() { return cidade; }
    public boolean isPrincipal() { return principal; }

    @Override
    public String toString() {
        return "Endereco{id=" + id + ", cidade='" + cidade + "', principal=" + principal + "}";
    }
}