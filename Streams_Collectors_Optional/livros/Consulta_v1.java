import java.util.List;

public class Consulta_v1 {
    public static List<Produto_v1> obterLivrosDoPedido(Pedido_v1 pedidoV1) {
        return pedidoV1.getProdutos().stream()
                .filter(produtoV1 -> produtoV1.getCategoria().equals(CategoriaProduto_v1.LIVRO))
                .toList();
    }
}
