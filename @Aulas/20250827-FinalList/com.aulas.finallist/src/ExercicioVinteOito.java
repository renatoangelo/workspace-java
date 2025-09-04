import vinteOitoArquivos.Arquivo;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioVinteOito {
    public static void main(String[] args) {
        List<Arquivo> arquivos = Arrays.asList(
                new Arquivo("foto1.jpg", 1200),
                new Arquivo("foto2.jpg", 2200),
                new Arquivo("foto3.jpg", 1800),
                new Arquivo("relatorio.pdf", 5000),
                new Arquivo("contrato.pdf", 3000),
                new Arquivo("apresentacao.pdf", 7000),
                new Arquivo("musica1.mp3", 8000),
                new Arquivo("musica2.mp3", 6000),
                new Arquivo("musica3.mp3", 10000),
                new Arquivo("musica4.mp3", 4000)
        );

        Map<String, List<Arquivo>> top3PorExtensao = arquivos.stream()
                .collect(Collectors.groupingBy(
                        Arquivo::getExtensao,
                        LinkedHashMap::new,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                lista -> lista.stream()
                                        .sorted(Comparator.comparingLong(Arquivo::getTamanho).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));

        top3PorExtensao.forEach((ext, lista) -> {
            System.out.println("Extensão: " + ext);
            lista.forEach(a -> System.out.println(" - " + a));
        });
    }
}
