package exemplos.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Filter.Alunos a1 = new Filter.Alunos(" Ana", 7.8);
        Filter.Alunos a2 = new Filter.Alunos(" Pedro", 5.8);
        Filter.Alunos a3 = new Filter.Alunos(" João", 9.8);
        Filter.Alunos a4 = new Filter.Alunos(" Paulo", 6.8);
        Filter.Alunos a5 = new Filter.Alunos(" Jessica", 7.1);
        Filter.Alunos a6 = new Filter.Alunos(" Gui", 8.8);
        List<Filter.Alunos> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        Predicate <Filter.Alunos> aprovado = a -> a.nota >=7;
        Function <Alunos, String> saudacaoAprovado =
                a -> "parabéns" + a.nome+ "! Você foi apriovado(a)";
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
    public static class Alunos {
        final String nome;
        final  double nota;
        final  boolean bomComportamento;

        public Alunos(String nome, double nota){
            this(nome, nota, true);
        }
        public Alunos(String nome, double nota, boolean bomComportamento){
            this.nome = nome;
            this.nota = nota;
            this.bomComportamento = bomComportamento;
        }
    }
}
