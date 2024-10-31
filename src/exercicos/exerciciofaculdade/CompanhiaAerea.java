package exercicos.exerciciofaculdade;

import java.util.ArrayList;

public class CompanhiaAerea {
    private String nome;
    private ArrayList<Voo> voos;

    public CompanhiaAerea (String nome){
        this.nome = nome;
        this.voos = new ArrayList<>();
    }
    public  void adicionarVoo(Voo voo){
        voos.add(voo);
    }
    public String getNome(){
        return  nome;
    }
}
