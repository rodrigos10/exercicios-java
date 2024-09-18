package contabancaria;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

//----------------------------------------------------//
    // construtores Nomecliente//
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

//----------------------------------------------------//
    // construtores NumConta //

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

//------------------------------------------------------//
    // construtores saldo //
    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

//-------------------------------------------------------//
    public String toString() {
        String s = "ContaBancaria[";
        s += "nomeCliente: " + nomeCliente;
        s += "numConta: " + numConta;
        s += "saldo: " + saldo;
        s += "]";
        return s;
    }
//--------------------------------------------------------//
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}





