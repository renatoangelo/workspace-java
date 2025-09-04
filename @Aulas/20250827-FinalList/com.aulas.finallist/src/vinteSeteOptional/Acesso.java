package vinteSeteOptional;

import java.time.LocalDate;

public class Acesso {
    private String usuario;
    private LocalDate data;

    public Acesso(String usuario, LocalDate data) {
        this.usuario = usuario;
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return usuario + " - " + data;
    }
}
