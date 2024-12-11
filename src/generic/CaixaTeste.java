package generic;

public class CaixaTeste {
    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("segredo");

        String coisaA = caixaA.abrir();
        System.out.println(caixaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(caixaB);
    }
}
