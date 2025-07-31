import java.util.Comparator;
import java.util.List;

public class Consulta_v3 {
    public static List<Produto> obterLivrosDoPedido(Pedido pedidoV1) {
        return pedidoV1.getProdutos().stream()
                .filter(produtoV1 -> produtoV1.getCategoria().equals(CategoriaProduto.LIVRO))
                .toList();
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .limit(1)
                .findFirst()
                .get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
        return produtos.stream()
                .filter(produto -> produto.getPreco() >= precoMinimo)
                .toList();
    }
}
