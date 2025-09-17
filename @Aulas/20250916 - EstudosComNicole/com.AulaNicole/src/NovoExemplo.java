import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NovoExemplo {
    public static void main(String[] args) {
        List<List<String>> listaDeListas = Arrays.asList(
                Arrays.asList("Renato", "Joao"),
                Arrays.asList("Bianca", "Douglas")
        );

        System.out.println(listaDeListas);

        List<String> lista = listaDeListas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Agora abaixo segue a nova lista unica sem ser lista de lista");
        System.out.println(lista);
    }
}
