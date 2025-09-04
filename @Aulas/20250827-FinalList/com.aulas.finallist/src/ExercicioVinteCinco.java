import vinteCincoFlatMap.Compra;
import vinteCincoFlatMap.Item;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinteCinco {
    public static void main(String[] args) {
        List<Compra> compras = Arrays.asList(
                new Compra(1, Arrays.asList(new Item("Maçã"), new Item("Banana"))),
                new Compra(2, Arrays.asList(new Item("Banana"), new Item("Laranja"))),
                new Compra(3, Arrays.asList(new Item("Maçã"), new Item("Pera")))
        );

        Map<String, Long> itensAgrupados = compras.stream()
                .flatMap(c -> c.getItens().stream())
                .collect(Collectors.groupingBy(
                        Item::getNome,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        itensAgrupados.forEach((nome, qtd) ->
                System.out.println(nome + " -> " + qtd)
        );
    }
}
