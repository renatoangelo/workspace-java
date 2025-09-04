package vinteOitoArquivos;

public class Arquivo {
    private String nome;
    private long tamanho;

    public Arquivo(String nome, long tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public long getTamanho() {
        return tamanho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public String getExtensao() {
        int idx = nome.lastIndexOf(".");
        return idx > 0 ? nome.substring(idx + 1).toLowerCase() : "";
    }

    @Override
    public String toString() {
        return nome + " (" + tamanho + ")";
    }
}
