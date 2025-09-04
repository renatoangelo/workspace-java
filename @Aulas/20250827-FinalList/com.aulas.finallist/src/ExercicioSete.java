import seteUniaoStrings.Pessoa;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioSete {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana"),
                new Pessoa("Bruno"),
                new Pessoa("Carlos"),
                new Pessoa("Daniela"),
                new Pessoa("Eduardo")
        );

        String nomesUnidos = pessoas.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.joining(", "));

        System.out.println("Nomes unidos: " + nomesUnidos);
    }
}
