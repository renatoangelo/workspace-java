import quinzeAgrupamentoAninhado.Filme;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioQuinze {
    public static void main(String[] args) {
        List<Filme> filmes = Arrays.asList(
                new Filme("Inception", "Ficção", 2010),
                new Filme("Interstellar", "Ficção", 2014),
                new Filme("Matrix", "Ficção", 1999),
                new Filme("O Senhor dos Anéis", "Fantasia", 2001),
                new Filme("Harry Potter", "Fantasia", 2001),
                new Filme("Gladiador", "Ação", 2000),
                new Filme("Mad Max: Fury Road", "Ação", 2015),
                new Filme("Pantera Negra", "Ação", 2018)
        );

        Map<String, Map<Integer, List<Filme>>> agrupados = filmes.stream()
                .collect(Collectors.groupingBy(
                        Filme::getGenero,
                        LinkedHashMap::new,
                        Collectors.groupingBy(
                                Filme::getAno,
                                LinkedHashMap::new,
                                Collectors.toList()
                        )
                ));

        agrupados.forEach((genero, mapaAno) -> {
            System.out.println("Gênero: " + genero);
            mapaAno.forEach((ano, lista) -> {
                System.out.println("  Ano: " + ano);
                lista.forEach(f -> System.out.println("   - " + f.getTitulo()));
            });
        });
    }
}
