import vinteUmReducao.Transacao;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

public class ExercicioVinteUm {
    public static void main(String[] args) {
        List<Transacao> transacoes = Arrays.asList(
                new Transacao("Aluguel", 1200.00),
                new Transacao("Aluguel", 1500.00),
                new Transacao("Supermercado", 300.00),
                new Transacao("Supermercado", 450.00),
                new Transacao("Transporte", 100.00),
                new Transacao("Transporte", 80.00),
                new Transacao("Aluguel", 1300.00)
        );

        Map<String, Optional<Transacao>> maiorPorDescricao = transacoes.stream()
                .collect(Collectors.groupingBy(
                        Transacao::getDescricao,
                        LinkedHashMap::new,
                        Collectors.reducing((t1, t2) ->
                                t1.getValor() >= t2.getValor() ? t1 : t2)
                ));

        maiorPorDescricao.forEach((descricao, transacao) ->
                System.out.println(descricao + " -> " + transacao.orElse(null))
        );
    }
}
