import noveBuscaElementos.Tarefa;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioNove {
    public static void main(String[] args) {
        List<Tarefa> tarefas = Arrays.asList(
                new Tarefa("Estudar Java", true),
                new Tarefa("Fazer exercícios físicos", false),
                new Tarefa("Ler um livro", true),
                new Tarefa("Arrumar o quarto", false),
                new Tarefa("Praticar inglês", true)
        );

        List<String> concluidas = tarefas.stream()
                .filter(Tarefa::isConcluida)
                .map(Tarefa::getTitulo)
                .collect(Collectors.toList());

        System.out.println("Tarefas concluídas:");
        concluidas.forEach(System.out::println);
    }
}
