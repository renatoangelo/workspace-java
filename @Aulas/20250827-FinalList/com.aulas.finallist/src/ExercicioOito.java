import oitoConversaoMapa.Usuario;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioOito {
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1, "Ana"),
                new Usuario(2, "Bruno"),
                new Usuario(3, "Carlos"),
                new Usuario(4, "Daniela"),
                new Usuario(5, "Eduardo")
        );

        Map<Integer, String> mapaUsuarios = usuarios.stream()
                .collect(Collectors.toMap(
                        Usuario::getId,
                        Usuario::getNome,
                        (n1, n2) -> n1,
                        LinkedHashMap::new
                ));

        mapaUsuarios.forEach((id, nome) ->
                System.out.println("ID: " + id + " - Nome: " + nome)
        );
    }
}
