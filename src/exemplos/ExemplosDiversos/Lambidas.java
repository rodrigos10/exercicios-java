package exemplos.ExemplosDiversos;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Lambidas {
    public class LambdaExample {
        public static void main(String[] args) {
            List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");

            // Usando expressão lambda para imprimir cada nome
            nomes.forEach(nome -> System.out.println(nome));
        }
        public static void exemplo2(){
            BinaryOperator<Double> calc = (x, y) -> {return x + y; };
            System.out.println(calc.apply(2.0, 3.0));

            calc = (x , y) -> x* y;
            System.out.println(calc.apply(2.0,3.0));

            BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
            System.out.println( calc.apply(2.0, 3.0));

            calc = (x, y) -> x * y;
            System.out.println(calc2.apply(2,3));
        }
        public static  void exemplo3  () {

            List<String> aprovados = Arrays
                    .asList("Ana", "Bia", "Lia", "Gui");
            System.out.println("Forma tradicional...");
            for (String nome : aprovados) {
                System.out.println(nome);
            }

            System.out.println("\nLambda #1...");
            aprovados.forEach(nome -> System.out.println(nome + "!!!"));

            System.out.println("\nMethod Reference...");
            aprovados.forEach(System.out::println);
        }
    }
}

