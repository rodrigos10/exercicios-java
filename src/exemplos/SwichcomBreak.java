package exemplos;

import java.util.Scanner;

public class SwichcomBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("informe a nota: ");
        int nota = entrada.nextInt();
        switch (nota){
            case 10 : case 9:
                conceito = "A";
            case 8: case 7: {
                conceito = "B";
                break;
            } case 6: case 5:
                    conceito = "c";
                    break;
                case 4: case 3:
                    conceito = "D";
                    break;
                case 2: case 1: case 0:
                    conceito = "E";
                    break;
            default:
                    conceito = "não informado!";
            }
                System.out.println("conceito é" + conceito);
                entrada.close();
        }

    }

