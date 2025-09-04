import vinteMapaChave.Usuario;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinte {
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario(1, "Ana Maria"),
                new Usuario(2, "Bruno Silva"),
                new Usuario(3, "Carlos Souza"),
                new Usuario(4, "Daniela Costa"),
                new Usuario(5, "Eduardo Alves")
        );

        Map<String, Usuario> mapaUsuarios = usuarios.stream()
                .collect(Collectors.toMap(
                        u -> gerarNomeUsuario(u.getNomeCompleto()),
                        u -> u,
                        (u1, u2) -> u1,
                        LinkedHashMap::new
                ));

        mapaUsuarios.forEach((username, usuario) ->
                System.out.println(username + " -> " + usuario)
        );
    }

    private static String gerarNomeUsuario(String nomeCompleto) {
        return nomeCompleto
                .toLowerCase()
                .replaceAll("\\s+", "."); // substitui espaços por pontos
    }
}
