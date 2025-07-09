import java.util.Arrays;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double sum = Arrays.stream(itens)
                .mapToDouble(i -> i.getQuantidade() * i.getProduto().obterPrecoLiquido())
                .sum();
        return sum - (sum * (percentualDesconto/100));
    }
}
