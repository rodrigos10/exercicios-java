package exerciciofaculdade;

public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private  double preco;
    private double taxaEmbarque; // variavel para a taxa de embarque
    public Passagem(Voo voo, String nomePassageiro, double preco , double taxadeEmbarque){
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
        this .taxaEmbarque = taxadeEmbarque; // inicializar a taxa de embarque
    }
    public double calcularPrecoTotal(){
        return preco + taxaEmbarque; // Adiciona a taxa de embarque ao preço da passagem
    }
    public String getNomePassageiro(){
        return  nomePassageiro;
    }
}
  //Mudanças realizadas:
// Adicionado o atributo taxaEmbarque: Agora a classe possui um atributo para armazenar a taxa de embarque fixa.
//  Atualizado o construtor: O construtor agora aceita um parâmetro para a taxa de embarque, permitindo que você a defina ao criar a instância de Passagem.
//  Atualizado o método calcularPrecoTotal: O cálculo do preço total agora soma o preço da passagem com a taxa de embarque fixa.