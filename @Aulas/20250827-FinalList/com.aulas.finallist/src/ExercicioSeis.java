import seisSoma.Transacao;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioSeis {
    public static void main(String[] args) {
        List<Transacao> transacoes = Arrays.asList(
                new Transacao(150.75),
                new Transacao(200.00),
                new Transacao(99.99),
                new Transacao(350.40),
                new Transacao(500.00)
        );

        double somaTotal = transacoes.stream()
                .collect(Collectors.summingDouble(Transacao::getValor));

        System.out.printf("Soma total das transações: %.2f%n", somaTotal);

    }
}
