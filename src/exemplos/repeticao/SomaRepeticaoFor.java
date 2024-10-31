package exemplos.repeticao;

import java.util.Scanner;

public class SomaRepeticaoFor {
    public static void main(String[] args) {

//Objetivo: Escreva um programa que imprime todos os números de 1 a 10

         // for (int i = 1; i <= 10; i++) {
        //  System.out.println("Resultado: " + i);
       // }
//-----------------------------------------------------------------//
// Objetivo: Escreva um programa que imprime
// a tabela de multiplicação de 1 a 10.
        Scanner sr = new Scanner(System.in);
        
   for (int i = 1; i <=10; i++){
       for (int j = 1; j <=10; j++){
           System.out.println(i * j + "\t");
       }
       System.out.println();
   }




    }
}

