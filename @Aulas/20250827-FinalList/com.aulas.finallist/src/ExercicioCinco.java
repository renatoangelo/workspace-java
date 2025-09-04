import cincoContagem.Funcionario;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioCinco {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", "Financeiro"),
                new Funcionario("Bruno", "TI"),
                new Funcionario("Carlos", "RH"),
                new Funcionario("Daniela", "Financeiro"),
                new Funcionario("Eduardo", "TI"),
                new Funcionario("Fernanda", "Financeiro"),
                new Funcionario("Gustavo", "RH"),
                new Funcionario("Helena", "TI")
        );

        Map<String, Long> contagemPorDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        contagemPorDepartamento.forEach((departamento, quantidade) ->
                System.out.println(departamento + ": " + quantidade)
        );
    }
}
