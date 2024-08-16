package exemplos;

public class Exercicio1 {
    /*
     * https://docentes.ifrn.edu.br/nickersonferreira/disciplinas/fundamentos-de-logica-e-algoritmos-1o-ano-info/lista-de-exercicios-repeticao/view
     *
     * 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.
     *
     * SOLUÇÃO COM WHILE
     **/
    public static void main(String[] args) {
        int resultado = 0;
        int auxiliar = 0;

        while (auxiliar <= 15) {
            resultado += auxiliar;
            auxiliar++;
        }

        System.out.println("Resultado: " + resultado);
    }
}

