import dezenoveOrdenacao.Atleta;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDezenove {
    public static void main(String[] args) {
        List<Atleta> atletas = Arrays.asList(
                new Atleta("Ana", 85),
                new Atleta("Bruno", 92),
                new Atleta("Carlos", 78),
                new Atleta("Daniela", 95),
                new Atleta("Eduardo", 88),
                new Atleta("Fernanda", 91),
                new Atleta("Gustavo", 76),
                new Atleta("Helena", 89)
        );

        List<Atleta> top5 = atletas.stream()
                .sorted(Comparator.comparingInt(Atleta::getPontuacao).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5 atletas:");
        top5.forEach(a ->
                System.out.println(a.getNome() + " - " + a.getPontuacao())
        );
    }
}
