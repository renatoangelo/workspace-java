import vinteNoveReduce.Vetor;
import java.util.*;

public class ExercicioVinteNove {
    public static void main(String[] args) {
        List<Vetor> vetores = Arrays.asList(
                new Vetor(1, 2),
                new Vetor(3, 4),
                new Vetor(-2, 5),
                new Vetor(0, -3)
        );

        Vetor somaTotal = vetores.stream()
                .reduce(new Vetor(0, 0), (v1, v2) -> v1.somar(v2));

        System.out.println("Soma total dos vetores: " + somaTotal);
    }
}
