package contabancaria;

import java.util.Calendar;

public class Contapoupanca extends  ContaBancaria {
    private int diaRendimento;

    public int getDiaRendimento(){
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }
    @Override
    public String toString(){
        String s = "ContaPoupança[";
        s += "diaRendimento: " + super.toString();
        s += "]";
        return s;
    }
    public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento== hoje.get(Calendar.DAY_OF_MONTH)){
            this.setsaldo(this.getsaldo()+(this.getsaldo()* taxaRendimento));
        return true;
        }
        return false;
    }
}
