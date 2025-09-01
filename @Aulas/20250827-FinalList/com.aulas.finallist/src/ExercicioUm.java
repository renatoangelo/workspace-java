import umMapeamentoSimples.Livro;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class ExercicioUm {
    public static void main(String[] args) {
        List<Livro> livros = Arrays.asList(
                new Livro("Como fazer amigos e influenciar Pessoas", "Dale Carnegie"),
                new Livro("Os segredos da Mente Milionária","Harv T Eker"),
                new Livro("Biblia", "Deus"),
                new Livro("Thing and Grow Rich", "Napolean Hill")
        );

        List<String> titulos = livros.stream()
                .map(Livro::getTitulo)
                .collect(Collectors.toList());

        System.out.println("Lista de títulos:");
        titulos.forEach(System.out::println);
    }

}
