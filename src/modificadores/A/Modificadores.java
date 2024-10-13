package modificadores.A;

import modificadores.A.Conta;
import modificadores.B.Cliente;

import java.util.List;

public class Modificadores {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        conta.cliente = cliente;
        conta.saldo = 0;
        conta.senha ="";

    }
}
