package generic;

public class ParesTest {
    public static void main(String[] args) {
        Pares<Integer , String>resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1,"Maria");
        resultadoConcurso.adicionar(2,"João");
        resultadoConcurso.adicionar(3,"Pedro");
        resultadoConcurso.adicionar(4,"José");
        resultadoConcurso.adicionar(5,"Carla");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));
    }
}
