package exemplos.contabancaria;

import java.util.Scanner;

public class Contas {
     String numeconta = "";
     double saldo = 0;

     public double deposita() {
          Scanner sr = new Scanner(System.in);


          System.out.println(" quanto quer depositar? ");
          double valor = sr.nextDouble();

          for (int i = 0; valor <= i; valor++){}

          return valor;
     }
}

