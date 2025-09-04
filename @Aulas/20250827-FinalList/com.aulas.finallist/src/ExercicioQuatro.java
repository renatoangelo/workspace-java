import quatroAgrupamento.Item;

import java.util.*;
import java.util.stream.Collectors;

public class ExercicioQuatro {
    public static void main(String[] args) {
        List<Item> itens = Arrays.asList(
                new Item("Mouse", "Informatica"),
                new Item("CPU", "Hardware"),
                new Item("ERP", "Software"),
                new Item("Keyboard", "Informatica"),
                new Item("Memoria", "Hardware"),
                new Item("Bling", "Software"),
                new Item("SDD NvMe2", "Informatica"),
                new Item("Cabo Flat", "Hardware"),
                new Item("CRM", "Software"),
                new Item("Monitor", "Informatica"),
                new Item("Placa Mae", "Hardware"),
                new Item("ClieentCrm", "Software"),
                new Item("Gabinete", "Informatica"),
                new Item("Cooler", "Hardware"),
                new Item("Hotmart", "Software"),
                new Item("Base para Notebook", "Informatica")

                );

        Map<String, List<Item>> itensPorCategoria = itens.stream()
                .collect(Collectors.groupingBy(
                        Item::getCategoria,
                        LinkedHashMap::new,
                        Collectors.toList()
                ));

        itensPorCategoria.forEach((categoria, lista) -> {
            System.out.println("Categoria: " + categoria);
            lista.forEach(i -> System.out.println(" - " + i.getNome()));
        });



    }
}