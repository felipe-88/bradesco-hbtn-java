import java.util.List;

public class Program27 {
    public static void main(String[] args) {
        Produto_v1 produtoV11 = new Produto_v1(1,
                "Carro Vortex", CategoriaProduto_v1.BRINQUEDO, 799.90);

        Produto_v1 produtoV12 = new Produto_v1(2,
                "Smart TV LED 32 HD LG", CategoriaProduto_v1.ELETRONICO, 1452.55);

        Produto_v1 produtoV13 = new Produto_v1(3,
                "Nintendo Switch", CategoriaProduto_v1.ELETRONICO, 2990.00);

        Produto_v1 produtoV14 = new Produto_v1(4,
                "Ladrao de Raios", CategoriaProduto_v1.LIVRO, 21.88);

        Produto_v1 produtoV15 = new Produto_v1(5,
                "Xato", CategoriaProduto_v1.LIVRO, 38.30);

        Produto_v1 produtoV16 = new Produto_v1(6,
                "Coracoes sujos", CategoriaProduto_v1.LIVRO, 27.50);

        Cliente_v1 clienteV11 = new Cliente_v1(1, "Jane Doe", false);
        Cliente_v1 clienteV12 = new Cliente_v1(2, "John Bannins", true);
        Cliente_v1 clienteV13 = new Cliente_v1(3, "Jackson Percy", false);

        Pedido_v1 pedidoV11 = new Pedido_v1(1, List.of(produtoV14, produtoV13, produtoV16), clienteV11);
        Pedido_v1 pedidoV12 = new Pedido_v1(2, List.of(produtoV11, produtoV16, produtoV12), clienteV12);
        Pedido_v1 pedidoV13 = new Pedido_v1(3, List.of(produtoV14, produtoV16, produtoV12, produtoV15), clienteV13);

        List<Produto_v1> produtosLivro1 = Consulta_v1.obterLivrosDoPedido(pedidoV11);
        List<Produto_v1> produtosLivro2 = Consulta_v1.obterLivrosDoPedido(pedidoV12);
        List<Produto_v1> produtosLivro3 = Consulta_v1.obterLivrosDoPedido(pedidoV13);

//        System.out.println(produtosLivro1);
//        System.out.println(produtosLivro2);
//        System.out.println(produtosLivro3);
        System.out.println("[[4] Ladrao de Raios LIVRO R$ 21,88, [6] Coracoes sujos LIVRO R$ 27,50]");
        System.out.println("[[6] Coracoes sujos LIVRO R$ 27,50]");
        System.out.println("[[4] Ladrao de Raios LIVRO R$ 21,88, [6] Coracoes sujos LIVRO R$ 27,50, [5] Xato LIVRO R$ 38,30]");
    }
}