package main.beecrowd;

import java.util.Scanner;

public class Bee1008 {
     public static void main(String[] args) {
    	 
		Scanner sa = new Scanner(System.in);
    
       	int numerofuncionario = sa.nextInt(),horastrabalhadas = sa.nextInt();
       	double valorporhoras = sa.nextDouble(), salario = horastrabalhadas * valorporhoras;      	       	       	       	
           
        String saidacodigo  = String.format("\n\nnumber = %d\nsalary = u$ %.2f\n\n", numerofuncionario, salario ); 
        
        
        
        
        System.out.println(saidacodigo);
	}
}
