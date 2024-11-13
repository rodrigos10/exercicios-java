package exemplos.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.cpf = "077.088.548-33";
        cliente.nome = "João cordeiro";


        Contas contas = new Contas();
        contas.saldo = 0;
        contas.numeconta = "6695.2457-54";


        Login login = new Login();
        login.senha = 1234;

        System.out.println("digite sua senha ");


        double a = sr.nextDouble();

        if (a == login.senha){
            System.out.println("Seu saldo é de: " + contas.saldo + contas.deposita());
        } else {
            System.out.println("senha incorreta");
        }
    }
}
