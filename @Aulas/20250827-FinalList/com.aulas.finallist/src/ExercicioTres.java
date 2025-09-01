import tresFiltragemMapeamento.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioTres {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Mouse",35.0),
                new Produto("Teclado",89.58),
                new Produto("Notebook", 3580.00),
                new Produto("MousePad Tapete", 45.00),
                new Produto("iPHone 12 Pro Max", 2850.50),
                new Produto("Suporte Notebook", 85.00),
                new Produto("Kit Teclado e Mouse", 115.24),
                new Produto("Cabo tipo C Original Apple", 225.14)
        );

        double limite = 100;

        List<String> nomeFiltrados = produtos.stream()
                .filter(p -> p.getPreco() >= limite)
                .map(Produto::getNome)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        //Collections.sort(nomeFiltrados, String.CASE_INSENSITIVE_ORDER);
        //Collections.sort(nomeFiltrados, Collections.reverseOrder());

        System.out.println("Produtos Filtrados maiores que 100");
        nomeFiltrados.forEach(System.out::println);
    }
}
