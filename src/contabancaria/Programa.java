package contabancaria;

public class Programa extends ContaBancaria{
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
}
