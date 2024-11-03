package exercicos.exerciciofaculdade;

import java.util.ArrayList;
import java.util.List;

public class venda {
    private List<Produto> produtos;

    public venda() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.valorUnitario * produto.quantidade;
        }
        //Trocar o operador || por && pois a espreção etara sempre verdadeira cobrindo o valor "total"
        if (total >= 500 && total < 1000) {

            //feita a subitração dos 0.05 de desconto corretamente e do operador logico || pelo &&.
            total -= total * 0.05;
        } else if (total >= 1000 && total < 2000) {

            //feita a subitração dos 0.10 de desconto corretamente e do operador logico || pelo &&.
            total -= total * 0.10;
        } else if (total >= 2000) {

            //feita a subitração dos 0.15 de desconto corretamente e do operador logico || pelo &&.
            total -= total * 0.15;
        }
        return total;
    }
}
