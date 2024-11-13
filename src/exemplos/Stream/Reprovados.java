package exemplos.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reprovados {

    public static void main(String[] args) {
        Alunos A1 = new Alunos("Gustavo", 4.3);
        Alunos A2 = new Alunos("Gabriela", 3.6);
        Alunos A3 = new Alunos("Sara", 2.9);

        List<Alunos> alunos = Arrays.asList(A1,A2,A3);
        Predicate<Alunos> Reprovados = a -> a.nota <=5;
        Function<Alunos, String> quepenaMaisSortenaProxima =
        a -> "Que pena " + a.nome+ " estude mais, Sua nota foi -> " + a.nota ;
        alunos.stream()
                .filter(a -> a.nota <=5)
                .map(quepenaMaisSortenaProxima)
                .forEach(System.out::println);
    }
}
