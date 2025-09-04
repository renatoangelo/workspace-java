import trezeParticionamento.Cliente;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioTreze {
    public static void main(String[] args) {
        List<Cliente> clientes = Arrays.asList(
                new Cliente("Ana", true),
                new Cliente("Bruno", false),
                new Cliente("Carlos", true),
                new Cliente("Daniela", false),
                new Cliente("Eduardo", true)
        );

        Map<Boolean, List<Cliente>> particionados = clientes.stream()
                .collect(Collectors.partitioningBy(Cliente::isAtivo));

        System.out.println("Clientes Ativos:");
        particionados.get(true).forEach(c -> System.out.println(" - " + c.getNome()));

        System.out.println("\nClientes Inativos:");
        particionados.get(false).forEach(c -> System.out.println(" - " + c.getNome()));
    }
}
