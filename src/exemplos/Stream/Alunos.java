package exemplos.Stream;

public class Alunos {
    final String nome;
     final double nota;
     final  boolean bomComportamento;

      public Alunos(String nome, double nota){
          this(nome, nota, true);
      }
     public Alunos(String nome, double nota, boolean bomComportamento){
         this.nome = nome;
         this.nota = nota;
         this.bomComportamento = bomComportamento;
     }
     @Override
    public int hashCode(){
         // TODO auto-generated method stud
         return super.hashCode();
     }
}
