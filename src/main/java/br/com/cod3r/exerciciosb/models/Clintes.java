package br.com.cod3r.exerciciosb.models;

public class Clintes {
    private int id;
    private String nome;
    private String cpf;
    public Clintes(int id, String nome, String cpf){
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
