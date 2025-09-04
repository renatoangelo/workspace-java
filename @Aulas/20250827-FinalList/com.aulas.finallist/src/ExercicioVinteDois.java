import vinteDoisMapeamento.Pessoa;
import java.util.*;
import java.util.stream.Collectors;
import java.time.*;

public class ExercicioVinteDois {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", LocalDate.of(2000, 5, 10)),
                new Pessoa("Bruno", LocalDate.of(1995, 3, 22)),
                new Pessoa("Carlos", LocalDate.of(2000, 8, 30)),
                new Pessoa("Daniela", LocalDate.of(1985, 11, 5)),
                new Pessoa("Eduardo", LocalDate.of(1995, 1, 14))
        );

        LocalDate hoje = LocalDate.now();

        Map<Integer, List<String>> mapaPorIdade = pessoas.stream()
                .collect(Collectors.groupingBy(
                        p -> Period.between(p.getDataNascimento(), hoje).getYears(),
                        LinkedHashMap::new,
                        Collectors.mapping(Pessoa::getNome, Collectors.toList())
                ));

        mapaPorIdade.forEach((idade, nomes) -> {
            System.out.println("Idade " + idade + ": " + nomes);
        });
    }
}
