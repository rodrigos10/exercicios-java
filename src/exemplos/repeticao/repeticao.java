package exemplos.repeticao;

import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int x = sr.nextInt();
        int soma = 0;
        while (x != 0){
            soma = soma + x;
           x= sr.nextInt();
        }
            System.out.print( soma);
    }
}
