import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args){

        List<String> list = new ArrayList<>(); // Criação e Instaciação da lista
        list.add("Maria"); // .add adiciona elementos na sua lista
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");
        System.out.println("Tamanho da lista 1 = " + list.size()); // Mostra o tamanho da lista
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("-----------------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // expressão lambda : Predicado
        // removeIF: remove elementos da sua lista com uma estrutura condicional
        System.out.println("Tamanho da lista 2 = " + list.size());
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        System.out.println("Index of Bob " + list.indexOf("Bob")); // Procura o índice/posição do elemento específico que você quer
        System.out.println("Index of Marco " + list.indexOf("Marco")); // Se o elemento que você quer não estiver na lista, o valor vai dar negativo, que significa que não foi encontrado na lista
        System.out.println("-----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // .stream permite você fazer expressões lambdas diretamente na criação de sua lista
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);



    }
}
