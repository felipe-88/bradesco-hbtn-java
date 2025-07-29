import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program25 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Produto_old produtoOld1 = new Produto_old("Cafe Chocolate Trufado Baggio",
                21.99, 250, 120, TiposProduto_.COZINHA);

        Produto_old produtoOld2 = new Produto_old("Leite Condensado Moca",
                6.29, 395, 200, TiposProduto_.COZINHA);

        Produto_old produtoOld3 = new Produto_old("Carro Vortex",
                799.90, 1560, 5, TiposProduto_.BRINQUEDO);

        Produto_old produtoOld4 = new Produto_old("Smart TV LED 32 HD LG",
                1452.55, 6300, 7, TiposProduto_.ELETRONICO);

        Produto_old produtoOld5 = new Produto_old("Nintendo Switch",
                2990.00, 1700, 12, TiposProduto_.ELETRONICO);

        List<Produto_old> produtoOlds = Arrays.asList(
                produtoOld1, produtoOld2, produtoOld3, produtoOld4, produtoOld5);

        List<Produto_old> produtosPrecoMaiorQue100 = ConsultaProdutos_.filtrar(produtoOlds,
                p -> p.getPreco() > 100);

        List<Produto_old> produtosPesoMenorOuIgual1600 = ConsultaProdutos_.filtrar(produtoOlds,
                p -> p.getPeso() <= 1600);

        List<Produto_old> produtosCozinha = ConsultaProdutos_.filtrar(produtoOlds,
                p -> p.getTipo() == TiposProduto_.COZINHA);

        List<Produto_old> produtosBaixoEstoque = ConsultaProdutos_.filtrar(produtoOlds,
                p -> p.getQuantidadeEmEstoque() <= 10);

        System.out.println(produtosPrecoMaiorQue100);
        System.out.println(produtosPesoMenorOuIgual1600);
        System.out.println(produtosCozinha);
        System.out.println(produtosBaixoEstoque);
    }
}