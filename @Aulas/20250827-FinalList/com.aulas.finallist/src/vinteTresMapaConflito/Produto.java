package vinteTresMapaConflito;

public class Produto {
    private int id;
    private String nome;
    private int versao;

    public Produto(int id, String nome, int versao) {
        this.id = id;
        this.nome = nome;
        this.versao = versao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getVersao() {
        return versao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return nome + " (versão " + versao + ")";
    }
}
