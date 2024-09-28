package exemplos;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object object){

        Usuario outro = (Usuario) object;

        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual= outro.email.equals(this.email);

        return nomeIgual && emailIgual;


    }



}
