import dozeMapeamentoObjeto.Pessoa;
import dozeMapeamentoObjeto.ResumoPessoa;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDoze {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 15),
                new Pessoa("Bruno", 25),
                new Pessoa("Carlos", 42),
                new Pessoa("Daniela", 65),
                new Pessoa("Eduardo", 80)
        );

        List<ResumoPessoa> resumos = pessoas.stream()
                .map(p -> new ResumoPessoa(
                        p.getNome(),
                        definirFaixaEtaria(p.getIdade())
                ))
                .collect(Collectors.toList());

        System.out.println("Resumos das pessoas:");
        resumos.forEach(System.out::println);
    }

    private static String definirFaixaEtaria(int idade) {
        if (idade < 18) return "Adolescente";
        else if (idade < 40) return "Adulto Jovem";
        else if (idade < 60) return "Meia-idade";
        else return "Idoso";
    }
}
