package contabancaria;

import java.util.Calendar;

public class Titular extends  ContaBancaria {
    public int String ;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = "ContaPoupança[";
        s += "diaRendimento: " + super.toString();
        s += "]";
        return s;
    }

    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        return false;
    }
}
