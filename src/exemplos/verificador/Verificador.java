package exemplos.verificador;

import java.util.Scanner;

public class Verificador {
    public static void verificarImparPar(int numero) {

    int resto = numero % 2;

    if(resto == 0) {
        System.out.println("SIM");
    } else {
        System.out.println("NÃO");
    }
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int entrada = 0;

        do {
            System.out.println("Digite um número: ");
            entrada = s.nextInt();

            Verificador.verificarImparPar(entrada);

        } while(entrada != -1);

        s.close();
    }





}
