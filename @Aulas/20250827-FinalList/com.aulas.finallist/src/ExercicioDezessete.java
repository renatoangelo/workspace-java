import dezesseteEstatisticas.Venda;
import java.util.*;
import java.util.stream.Collectors;
import java.util.DoubleSummaryStatistics;

public class ExercicioDezessete {
    public static void main(String[] args) {
        List<Venda> vendas = Arrays.asList(
                new Venda("Notebook", 3500.00),
                new Venda("Notebook", 4200.00),
                new Venda("Mouse", 80.00),
                new Venda("Mouse", 120.00),
                new Venda("Teclado", 200.00),
                new Venda("Teclado", 250.00),
                new Venda("Notebook", 3900.00)
        );

        Map<String, DoubleSummaryStatistics> estatisticasPorProduto = vendas.stream()
                .collect(Collectors.groupingBy(
                        Venda::getProduto,
                        LinkedHashMap::new,
                        Collectors.summarizingDouble(Venda::getValor)
                ));

        estatisticasPorProduto.forEach((produto, stats) -> {
            System.out.println("Produto: " + produto);
            System.out.printf("  Soma: %.2f%n", stats.getSum());
            System.out.printf("  Média: %.2f%n", stats.getAverage());
            System.out.printf("  Mínimo: %.2f%n", stats.getMin());
            System.out.printf("  Máximo: %.2f%n", stats.getMax());
        });
    }
}
