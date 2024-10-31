package exemplos.verificador;

import javax.xml.transform.OutputKeys;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         String valor = "";
         while(!valor.equalsIgnoreCase("sair")){
         System.out.println("diga: ");
          valor = entrada.nextLine();}
          entrada.close();
    }
}