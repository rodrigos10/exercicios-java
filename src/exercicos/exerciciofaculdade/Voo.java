package exercicos.exerciciofaculdade;

public class Voo {
    private String codigo;
    private int totalAssentos;
    private  int assentosOcupados;
    private String aeroportoOrigem;  // Atributo para o aeroporto de origem
    private String aeroportoDestino;  // Atributo para o aeroporto de destino

    public Voo(String codigo, int totalAssentos){
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
        this.aeroportoOrigem = aeroportoOrigem;  // Inicializando o aeroporto de origem
        this.aeroportoDestino = aeroportoDestino; // Inicializando o aeroporto de destino

    }

    // foi adicionada o if else para verificar se a assentos disponiveis para ser reservados
    public void reservrAssento(){
        if (assentosOcupados < totalAssentos) {
            assentosOcupados++;
        } else {
            System.out.println("Não é possível reservar mais assentos");
        }
    }

    public int getAssentosDisponiveis(){
        return totalAssentos - assentosOcupados; // Retorna a quantidade de assentos disponíveis
    }

    public String getCodigo(){
        return codigo;
    }
    public String getAeroportoOrigem(){
        return aeroportoOrigem; // Método para obter o aeroporto de origem
    }
    public  String getAeroportoDestino(){
        return aeroportoDestino; // Método para obter o aeroporto de destino
    }
}
//Mudanças realizadas:
//Verificação de limite de assentos: Adicionei uma condição no método reservarAssento que verifica se o número de assentosOcupados é menor que totalAssentos antes de incrementar.
//Correção no método getAssentosDisponiveis: O método agora retorna a quantidade de assentos disponíveis, subtraindo o número de assentos ocupados do total de assentos.