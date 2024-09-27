package contabancaria;

public class ContaBancaria {
    public String nomeCliente;
    public String numConta;
    public String CPF;
    public String senha;
   //-----------------------------------------------------------//
    public String getNomeCliente() {

        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
   //-----------------------------------------------------------//
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    //----------------------------------------------------------//
    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    //----------------------------------------------------------//
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}









