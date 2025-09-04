package trintaRelacionamento;

public class Funcionario {
    private int id;
    private String nome;
    private int departamentoId;

    public Funcionario(int id, String nome, int departamentoId) {
        this.id = id;
        this.nome = nome;
        this.departamentoId = departamentoId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

    @Override
    public String toString() {
        return nome;
    }
}
