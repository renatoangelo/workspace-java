package noveBuscaElementos;

public class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo, boolean concluida) {
        this.titulo = titulo;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
