import onzeAgrupamentoSoma.Pedido;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioOnze {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, 100.50),
                new Pedido(2, 200.00),
                new Pedido(1, 150.25),
                new Pedido(3, 300.00),
                new Pedido(2, 50.75),
                new Pedido(3, 120.00),
                new Pedido(1, 80.00)
        );

        Map<Integer, Double> somaPorId = pedidos.stream()
                .collect(Collectors.groupingBy(
                        Pedido::getId,
                        LinkedHashMap::new,
                        Collectors.summingDouble(Pedido::getValor)
                ));

        somaPorId.forEach((id, soma) ->
                System.out.printf("Pedido ID %d -> Soma total: %.2f%n", id, soma)
        );
    }
}
