package exemplos.ExemplosDiversos;

public class Exchange {
    public final double cotacaoDolar = 5.5;
    public final double iof = 0.0586;
    public final double taxaOperacaoEmPercentual = 0.01;
    @SuppressWarnings("unesed")
    public double ComprarDolar(double valorReal) {

        double valorDolar = valorReal / cotacaoDolar;
        double valorDolarComIOF = valorDolar * (1 - iof);
        double taxaOperacao = valorDolarComIOF * taxaOperacaoEmPercentual;

        return valorDolarComIOF;
    }
        public static void main (String[]args){
           Exchange exchange = new Exchange();
            double valorReal = 1000;
            double valordolar = exchange.ComprarDolar(valorReal);
            String valorDolar = String.format("%.2f",valordolar);
            System.out.println("Valor em Dólar: " + valorDolar);
        }
}

