package main.beecrowd;

import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        int anos = idade / 365;
        System.out.println(anos );
        int meses = idade % 365 / 30;
        System.out.println(meses);
        int dias = idade % 365 %30;
        System.out.println(dias);
    }
}
