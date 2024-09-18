package contabancaria;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String toString() {
        String s = "ContaEspecial[";
        s += "limite: " + limite;
        s += "; " + super.toString();
        s += "]";
        return s;
    }

    public boolean sacar(double valor) {
        double saldoComLimite = this.getsaldo() + limite;
        if ((saldoComLimite - valor)>=0){
            this.setsaldo(this.getsaldo()-valor);

            return  true;
        }
        
        return  false;

    }
}