import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<List<String>> listaDeListas = Arrays.asList(
                Arrays.asList("Renato", "Joao"),
                Arrays.asList("Bianca", "Douglas")
        );

        System.out.println(listaDeListas);

        List<String> listaUnica = listaDeListas.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(listaUnica);


    }
}