import vinteSeteOptional.Acesso;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Optional;

public class ExercicioVinteSete {
    public static void main(String[] args) {
        List<Acesso> acessos = Arrays.asList(
                new Acesso("Ana", LocalDate.of(2023, 5, 10)),
                new Acesso("Bruno", LocalDate.of(2023, 7, 20)),
                new Acesso("Ana", LocalDate.of(2023, 8, 15)),
                new Acesso("Carlos", LocalDate.of(2023, 6, 12)),
                new Acesso("Bruno", LocalDate.of(2023, 9, 1)),
                new Acesso("Carlos", LocalDate.of(2023, 7, 25))
        );

        Map<String, Optional<Acesso>> ultimoAcessoPorUsuario = acessos.stream()
                .collect(Collectors.groupingBy(
                        Acesso::getUsuario,
                        Collectors.maxBy(Comparator.comparing(Acesso::getData))
                ));

        ultimoAcessoPorUsuario.forEach((usuario, acesso) ->
                System.out.println(usuario + " -> " + acesso.orElse(null).getData())
        );
    }
}
