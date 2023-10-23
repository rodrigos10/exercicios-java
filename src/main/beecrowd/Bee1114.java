package main.beecrowd;

import java.util.Scanner;

public class Bee1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        for(int a = 2002; senha != a ; a++){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
            System.out.println(a+"Acesso Permitido");
        }
    }
}
// jeito certo
//public class Bee_1114 {
//    public static void verificarSenha(int senha) {
//        if (senha == 2002) {
//            System.out.println("Acesso Permitido");
//        } else {
//            System.out.println("Senha Invalida");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int senha = 0;
//
//        do {
//            senha = s.nextInt();
//            Bee_1114.verificarSenha(senha);
//        } while (senha != 2002);
//    }
//}