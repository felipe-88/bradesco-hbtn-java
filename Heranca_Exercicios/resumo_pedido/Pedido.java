import java.util.Arrays;
import java.util.Locale;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    private double getSum() {
        double sum = Arrays.stream(itens)
                .mapToDouble(i -> i.getQuantidade() * i.getProduto().obterPrecoLiquido())
                .sum();
        return sum;
    }

    private double getDesconto(double soma) {
        return (soma * (percentualDesconto/100));
    }

    public double calcularTotal() {
        double sum = getSum();
        return sum - getDesconto(sum);
    }

    public void apresentarResumoPedido() {
        System.out.println("------ RESUMO PEDIDO ------");
        Arrays.
                stream(itens)
                .forEach(i -> System.out.printf("Tipo: %s Titulo: %s Preco: %.2f Quant: %d Total: %.2f\n",
                        i.getProduto().getClass().getName().trim(),
                        i.getProduto().getTitulo().trim(),
                        i.getProduto().obterPrecoLiquido(),
                        i.getQuantidade(),
                        i.getQuantidade() * i.getProduto().obterPrecoLiquido()));
        System.out.println("------------------------");
        System.out.printf("DESCONTO: %.2f\n", getDesconto(getSum()));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", getSum());
        System.out.println("------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("------------------------");
    }
}
