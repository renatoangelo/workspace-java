import doisConversaoTipos.Venda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioDois {
    public static void main(String[] args) {
        List<Venda> vendas = Arrays.asList(
            new Venda("10.00"),
            new Venda("15.00"),
            new Venda("18.25"),
            new Venda("14.25"),
            new Venda("11.14"),
            new Venda("12.58"),
            new Venda("14.78")
        );

        List<Double> valores = vendas.stream()
                .map(v -> Double.parseDouble(v.getValor()))
                .collect(Collectors.toList());

        System.out.println("Lista de Valores Double");
        valores.forEach(System.out::println);
    }
}
