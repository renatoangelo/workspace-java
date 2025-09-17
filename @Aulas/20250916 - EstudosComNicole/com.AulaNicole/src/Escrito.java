import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Escrito {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<>(Arrays.asList("Joao", "Renato", "Nicole", "Luiz"));
        listaDeNomes.add("Joaquim");
        listaDeNomes.add("Maria");
        listaDeNomes.add("Renato");
        listaDeNomes.add("Luiz");
        listaDeNomes.add("Bianca");
        listaDeNomes.add("Maria");
        listaDeNomes.add("Renato");
        listaDeNomes.add("Luiz");



        System.out.println("Hello World");

        System.out.println(listaDeNomes);

        List<String> listaNova = listaDeNomes.stream()
                .collect(Collectors.toList());


        listaNova.forEach(System.out::println);

    }
}