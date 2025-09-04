import quatorzeCalculoMedia.Estudante;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        List<Estudante> estudantes = Arrays.asList(
                new Estudante("Ana", 8.5),
                new Estudante("Bruno", 6.0),
                new Estudante("Carlos", 7.2),
                new Estudante("Daniela", 9.1),
                new Estudante("Eduardo", 5.8)
        );

        double media = estudantes.stream()
                .collect(Collectors.averagingDouble(Estudante::getNota));

        System.out.printf("Média das notas: %.2f%n", media);
    }
}
