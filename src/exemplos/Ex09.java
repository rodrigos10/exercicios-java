package exemplos;

import java.util.Scanner;

/*
 * Escreva	um	programa para ler 3 valores inteiros e escrever o maior  deles.
 * Considere que o usuário	não	informará valores iguais.
 *
 */

public class Ex09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " eh o maior");
        } else if (b > a && b > c) {
            System.out.println(b + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }
        s.close();
    }
}
