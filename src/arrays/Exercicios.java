package arrays;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print(" Quantas Notas Você quer Informar? ");

        int qtdeNotas = sr.nextInt();

        double[] notas = new double [qtdeNotas];

        for (int i = 0; i < notas.length; i++) {
             System.out.println("informe a nota " + (i + 1) + ": ");
             notas[i] = sr.nextDouble();
       }
        double total = 0;
       for(double nota: notas){
           total +=nota;
       }
       double media = total / notas.length;
        System.out.println("A média é " + media + "!");
    sr.close();
    }
}
