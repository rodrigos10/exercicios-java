package main.beecrowd;/*
 * Becrowd 1035
 *
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for
 * maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos,
 * forem positivos e se a variável A for par escrever a mensagem "Valores aceitos",
 * senão escrever "Valores nao aceitos".
 *
 * Quatro números inteiros A, B, C e D.
 */

import java.util.Scanner;

public class Bee135 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), d = s.nextInt();

        boolean bMaiorC = b > c;
        boolean dMaiorA = d > a;
        boolean somaCDMaiorSomaAB = (c + d) > (a + b);
        boolean cdPositivos = (c > 0) && (d > 0);
        boolean aPar = (a % 2) == 0;

        // Aqui temos um exemplo usando os booleanos das variáveis para fazer o que o exercício pede
        if(bMaiorC && dMaiorA && somaCDMaiorSomaAB && cdPositivos && aPar) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        // Aqui temos exatamente o mesmo código acima, mas fazendo as comparações diretamente no IF
        if((b > c) && (d > a) && ((c + d) > (a + b)) && ((c > 0) && (d > 0)) && ((a % 2) == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}