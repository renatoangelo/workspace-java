import dezoitoUniaoDelimitador.Item;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDezoito {
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
                new Item("Maçã", 5),
                new Item("Banana", 12),
                new Item("Laranja", 8),
                new Item("Pera", 4)
        );

        String resultado = itens.stream()
                .map(i -> i.getNome() + " (" + i.getQuantidade() + ")")
                .collect(Collectors.joining(" | "));

        System.out.println("Lista formatada: " + resultado);
    }
}
