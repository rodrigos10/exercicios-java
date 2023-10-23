package main.beecrowd;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int A = numero.nextInt();
        int B = numero.nextInt();
        int C = numero.nextInt();

        if(A > B && A > C){
            System.out.println(C + "maior");
        } else if (B > A && B > C){
            System.out.println(B + "maior");
        } else {
            System.out.println(C + " maior");
        }numero.close();
    }
}
