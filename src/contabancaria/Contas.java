package contabancaria;

import java.util.Calendar;

public class Contas{
    public ContaBancaria contaBancaria;
    public double saldo;

 //-------------------------------------------//
    public Contas(ContaBancaria contaBancaria){
        this.contaBancaria = contaBancaria;
    }
 //------------------------------------------//
    public Contas(double saldo){
        this.saldo=saldo;
    }
 //---------------depositar------------------//
    public void depositar(double vaolor){
        this.saldo += vaolor;
    }
//---------------sacar----------------------//
    public void sacar(double valor){
        this.saldo -= valor;
    }
//---------------Transferir-----------------//
    public void trsnferir(double valor, Contas contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
