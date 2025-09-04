import trintaRelacionamento.Funcionario;
import trintaRelacionamento.Departamento;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioTrinta {
    public static void main(String[] args) {
        List<Departamento> departamentos = Arrays.asList(
                new Departamento(1, "TI"),
                new Departamento(2, "Financeiro"),
                new Departamento(3, "RH")
        );

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario(1, "Ana", 1),
                new Funcionario(2, "Bruno", 1),
                new Funcionario(3, "Carlos", 2),
                new Funcionario(4, "Daniela", 3),
                new Funcionario(5, "Eduardo", 2)
        );

        Map<Integer, List<Funcionario>> funcionariosPorDepto = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamentoId));

        departamentos.forEach(depto -> {
            List<Funcionario> lista = funcionariosPorDepto.getOrDefault(depto.getId(), new ArrayList<>());
            System.out.println("Departamento: " + depto.getNome());
            lista.forEach(f -> System.out.println(" - " + f.getNome()));
        });
    }
}
