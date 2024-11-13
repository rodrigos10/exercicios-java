package exemplos.ExemplosDiversos;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "João silva";
        u1.email = "joãosilva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "João silva";
        u2.email = "joãosilva@gmail.com";

        System.out.println(u1 == u2);
    }
}
