package main.beecrowd;

import java.util.Scanner;

public class Bee2147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String teste = "";
        double tempo =0.01;
        for (int i = 0;i<numero;i++){
              teste=sc.next();
              tempo*=teste.length();
            System.out.println(String.format("%.2f",tempo));
             tempo=0.01;
        }
    }
}
