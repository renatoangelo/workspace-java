package vinteCincoFlatMap;

import java.util.List;

public class Compra {
    private int id;
    private List<Item> itens;

    public Compra(int id, List<Item> itens) {
        this.id = id;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
