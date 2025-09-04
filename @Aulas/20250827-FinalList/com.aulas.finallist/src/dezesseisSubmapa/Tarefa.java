package dezesseisSubmapa;

public class Tarefa {
    private int id;
    private int projetoId;
    private String descricao;

    public Tarefa(int id, int projetoId, String descricao) {
        this.id = id;
        this.projetoId = projetoId;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getProjetoId() {
        return projetoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjetoId(int projetoId) {
        this.projetoId = projetoId;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
