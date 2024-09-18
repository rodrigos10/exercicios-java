package exemplos;

import java.util.Scanner;
//Leia 4 valores inteiros A, B, C e D. A seguir,
// se B for maior do que C e se D for maior do que A,
// e a soma de C com D for maior que a soma de A e B e se C e D,
// ambos, forem positivos e se a variável A for par escrever a mensagem
// "Valores aceitos", senão escrever "Valores nao aceitos".

public class revibee135 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);

        int valorA = sr.nextInt(), valorB = sr.nextInt(), valorC = sr.nextInt(), valorD = sr.nextInt();

        if (valorB > valorC && valorD > valorA && (valorC > 0)&&(valorD > 0)&&(valorA % 2) == 0){
            System.out.println("valores aceitos");
        } else {
            System.out.println("valores não ceitos");
        }
    }
}

//CREATE TABLE FUNCIONARIO (
//    CPF CHAR(11) PRIMARY KEY,
//    Nome_Completo VARCHAR(100) NOT NULL,
//    Departamento VARCHAR(50),
//    Telefone CHAR(10),
//    Email VARCHAR(100),
//    SUBORDINADO_A CHAR(11),
//    FOREIGN KEY (SUBORDINADO_A) REFERENCES FUNCIONARIO(CPF)
//);