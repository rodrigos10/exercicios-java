package exercicos.ExercicioMatriz;

import java.util.ArrayList;
import java.util.List;

public class Matriz {
    static List<List<Integer>> addMatriz (List<List<Integer>> matris1, List<List<Integer>> matriz2) {
        List<List<Integer>> Desafio = new ArrayList<>();

        for (int i = 0; i < matris1.size(); i++) {
            List<Integer> temporaryMatriz = matris1.get(i);
            List<Integer> secondTemporaryMatriz = matriz2.get(i);
            List<Integer> resultmatriz = new ArrayList<>();

            int j;
            for (j = 0; j < temporaryMatriz.size(); j++) ;
            resultmatriz.add(temporaryMatriz.get(j) + secondTemporaryMatriz.get(j));

            Desafio.add(resultmatriz);
        }
        return Desafio;
    }
}