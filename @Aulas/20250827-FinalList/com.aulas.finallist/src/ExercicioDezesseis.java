import dezesseisSubmapa.Projeto;
import dezesseisSubmapa.Tarefa;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioDezesseis {
    public static void main(String[] args) {
        List<Projeto> projetos = Arrays.asList(
                new Projeto(1, "Sistema de Vendas"),
                new Projeto(2, "Aplicativo Mobile")
        );

        List<Tarefa> tarefas = Arrays.asList(
                new Tarefa(101, 1, "Criar banco de dados"),
                new Tarefa(102, 1, "Desenvolver API"),
                new Tarefa(103, 2, "Criar interface de login"),
                new Tarefa(104, 2, "Implementar notificações"),
                new Tarefa(105, 1, "Testar endpoints")
        );

        Map<Integer, Map<Integer, String>> tarefasPorProjeto = tarefas.stream()
                .collect(Collectors.groupingBy(
                        Tarefa::getProjetoId,
                        LinkedHashMap::new,
                        Collectors.toMap(
                                Tarefa::getId,
                                Tarefa::getDescricao,
                                (d1, d2) -> d1,
                                LinkedHashMap::new
                        )
                ));

        tarefasPorProjeto.forEach((projetoId, mapaTarefas) -> {
            String nomeProjeto = projetos.stream()
                    .filter(p -> p.getId() == projetoId)
                    .map(Projeto::getNome)
                    .findFirst()
                    .orElse("Desconhecido");

            System.out.println("Projeto: " + nomeProjeto);
            mapaTarefas.forEach((id, desc) ->
                    System.out.println("  Tarefa " + id + ": " + desc)
            );
        });
    }
}
