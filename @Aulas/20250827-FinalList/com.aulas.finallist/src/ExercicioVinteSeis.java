import vinteSeisParticionamento.Funcionario;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinteSeis {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", 2500.0),
                new Funcionario("Bruno", 3200.0),
                new Funcionario("Carlos", 1800.0),
                new Funcionario("Daniela", 4000.0),
                new Funcionario("Eduardo", 2900.0)
        );

        double media = funcionarios.stream()
                .collect(Collectors.averagingDouble(Funcionario::getSalario));

        Map<Boolean, List<Funcionario>> particionados = funcionarios.stream()
                .collect(Collectors.partitioningBy(f -> f.getSalario() > media));

        System.out.printf("Média salarial: %.2f%n%n", media);

        System.out.println("Acima da média:");
        particionados.get(true).forEach(f ->
                System.out.println(" - " + f.getNome() + " (" + f.getSalario() + ")")
        );

        System.out.println("\nNa média ou abaixo:");
        particionados.get(false).forEach(f ->
                System.out.println(" - " + f.getNome() + " (" + f.getSalario() + ")")
        );
    }
}
