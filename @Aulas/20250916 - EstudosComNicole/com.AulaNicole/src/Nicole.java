import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nicole {
    public static void main(String[]  args) {
        System.out.println("Hello Nicole");
        System.out.println("Hello essa é a aula 02");

        List<String> listaDeNomes = new ArrayList<>(Arrays.asList("Renato", "Nicole", "Luiz", "Bianca"));
        listaDeNomes.add("Joao");
        listaDeNomes.add("Maria");


        listaDeNomes.forEach(System.out::println);
    }
}