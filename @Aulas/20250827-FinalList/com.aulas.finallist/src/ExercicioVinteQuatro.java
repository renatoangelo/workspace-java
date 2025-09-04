import vinteQuatroFrequencia.Palavra;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinteQuatro {
    public static void main(String[] args) {
        List<Palavra> palavras = Arrays.asList(
                new Palavra("java"),
                new Palavra("stream"),
                new Palavra("java"),
                new Palavra("map"),
                new Palavra("filter"),
                new Palavra("java"),
                new Palavra("map"),
                new Palavra("collect")
        );

        Map<String, Long> frequencia = palavras.stream()
                .collect(Collectors.groupingBy(
                        Palavra::getTexto,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        frequencia.forEach((texto, count) ->
                System.out.println(texto + " -> " + count)
        );
    }
}
