package main.beecrowd;

import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int horas = 2;
        double distancia = x.nextDouble() * horas;
        String saida = String.format("%.0f", distancia);
        System.out.println(saida + " minutos");
    }
}
