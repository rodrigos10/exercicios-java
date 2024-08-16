package exemplos;

import java.util.Scanner;

/*
 * https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
 *
 * 5) Escreva um algoritmo que leia 500 números do usuário e calcule a soma desses números.
 *
 * VERSÃO BOA PRÁTICA
 *
 * */
public class SomaEntradaFormaPratica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d° número:   ", i + 1);
            soma += sc.nextInt();
        }

        System.out.println("Resultado: " + soma);

        sc.close();
    }
}
