import vinteTresMapaConflito.Produto;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinteTres {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto(1, "Notebook", 1),
                new Produto(2, "Mouse", 1),
                new Produto(1, "Notebook", 2),
                new Produto(3, "Teclado", 1),
                new Produto(2, "Mouse", 3),
                new Produto(1, "Notebook", 3),
                new Produto(3, "Teclado", 2)
        );

        Map<Integer, Produto> mapaProdutos = produtos.stream()
                .collect(Collectors.toMap(
                        Produto::getId,
                        p -> p,
                        (p1, p2) -> p1.getVersao() >= p2.getVersao() ? p1 : p2,
                        LinkedHashMap::new
                ));

        mapaProdutos.forEach((id, produto) ->
                System.out.println("ID " + id + " -> " + produto)
        );
    }
}
