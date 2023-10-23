package main;

import java.util.Scanner;

/*
 * https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
 *
 * 5) Escreva um algoritmo que leia 500 números do usuário e calcule a soma desses números.
 *
 * VERSÃO CANSATIVA
 *
 * */

public class SomaEntradaCansativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();

        int soma = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

        System.out.println("Soma: " + soma);

        sc.close();

    }
}
