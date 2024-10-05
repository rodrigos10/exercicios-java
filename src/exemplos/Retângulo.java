package exemplos;

import java.util.Scanner;

public class Retângulo {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Digite a largura do retâgulo: ");
        double largura = sr.nextDouble();

        System.out.println("Digite o comprimento do retângulo: ");
        double comprimento = sr.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("O perimetro  do retângulo é: " + perimetro);
        System.out.println("A area do retângulo é: " + area);

        sr.close();
    }
}
