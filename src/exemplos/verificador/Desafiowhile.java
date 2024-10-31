package exemplos.verificador;

import java.util.Scanner;

public class Desafiowhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadesdenotas = 0;
        double nota = 0;
        double total = 0;
        while (nota != 1) {
            System.out.println("digite a nota: ");
            nota = entrada.nextDouble();
             total += nota;
             quantidadesdenotas++;
        }
        double media = total / quantidadesdenotas;
        System.out.println("media= " + media);
        entrada.close();
    }
}
