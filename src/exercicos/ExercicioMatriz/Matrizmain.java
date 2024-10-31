package exercicos.ExercicioMatriz;

import java.util.ArrayList;
import java.util.List;

import static exercicos.ExercicioMatriz.Matriz.addMatriz;

public class Matrizmain {
    public static void main(String[] args) {
        List<List<Integer>>matriz1=new ArrayList<>();
        List<List<Integer>>matriz2=new ArrayList<>();

        for (int i = 0; i < 10; i++){
    List<Integer> aa = new ArrayList<>();

    for (int j = 0; j < 10;j++) {
        aa.add(i + j);
    }
    matriz1.add(aa);
    matriz2.add(aa);
        }
        List<List<Integer>> resultmatriz = addMatriz(matriz1,matriz2);


        for (List<Integer>integers : resultmatriz){
            System.out.println(integers.toString());
        }
    }
}
