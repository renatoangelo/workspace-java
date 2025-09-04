import dezExtracaoAtributo.Carro;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDez {
    public static void main(String[] args) {
        List<Carro> carros = Arrays.asList(
                new Carro("Civic", 2020),
                new Carro("Corolla", 2019),
                new Carro("Jeep", 2019),
                new Carro("Focus", 2018),
                new Carro("Golf", 2021),
                new Carro("Fusion", 2017)
        );

        List<Integer> anos = carros.stream()
                .map(Carro::getAno)
                .collect(Collectors.toList());

        System.out.println("Anos de fabricação:");
        anos.forEach(System.out::println);
    }
}
