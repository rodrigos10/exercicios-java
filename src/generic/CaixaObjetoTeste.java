package generic;

public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        double coisa = (double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaA.guardar("Ola");

       String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);
    }
}
