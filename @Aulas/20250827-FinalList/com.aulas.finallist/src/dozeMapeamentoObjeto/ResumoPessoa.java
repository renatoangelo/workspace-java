package dozeMapeamentoObjeto;

public class ResumoPessoa {
    private String nomeCompleto;
    private String faixaEtaria;

    public ResumoPessoa(String nomeCompleto, String faixaEtaria) {
        this.nomeCompleto = nomeCompleto;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    @Override
    public String toString() {
        return nomeCompleto + " - " + faixaEtaria;
    }
}
