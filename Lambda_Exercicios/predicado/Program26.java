import java.lang.reflect.Method;
import java.util.*;
import java.util.function.*;
import java.util.Locale;

public class Program26 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Produto_old1 produtoOld11 = new Produto_old1("Cafe Chocolate Trufado Baggio",
                21.99, 250, 120, TiposProduto.COZINHA);

        Produto_old1 produtoOld12 = new Produto_old1("Leite Condensado Moca",
                6.29, 395, 200, TiposProduto.COZINHA);

        Produto_old1 produtoOld13 = new Produto_old1("Carro Vortex",
                799.90, 1560, 5, TiposProduto.BRINQUEDO);

        Produto_old1 produtoOld14 = new Produto_old1("Smart TV LED 32 HD LG",
                1452.55, 6300, 7, TiposProduto.ELETRONICO);

        Produto_old1 produtoOld15 = new Produto_old1("Nintendo Switch",
                2990.00, 1700, 12, TiposProduto.ELETRONICO);

        List<Produto_old1> produtoOld1s = Arrays.asList(
                produtoOld11, produtoOld12, produtoOld13, produtoOld14, produtoOld15);

        List<Produto_old1> produtosPrecoMaiorQue100 = ConsultaProdutos.filtrar(produtoOld1s,
                p -> p.getPreco() > 100);

        List<Produto_old1> produtosPesoMenorOuIgual1600 = ConsultaProdutos.filtrar(produtoOld1s,
                p -> p.getPeso() <= 1600);

        List<Produto_old1> produtosCozinha = ConsultaProdutos.filtrar(produtoOld1s,
                p -> p.getTipo() == TiposProduto.COZINHA);

        List<Produto_old1> produtosBaixoEstoque = ConsultaProdutos.filtrar(produtoOld1s,
                p -> p.getQuantidadeEmEstoque() <= 10);

        try
        {
            Method method = ConsultaProdutos.class.getMethod("filtrar", List.class, Predicate.class);
            if (method != null) {
                System.out.println("Metodo encontrado");
            }
        } catch(NoSuchMethodException ex) {
            System.out.println("Metodo nao encontrado");
        }

        System.out.println(produtosPrecoMaiorQue100);
        System.out.println(produtosPesoMenorOuIgual1600);
        System.out.println(produtosCozinha);
        System.out.println(produtosBaixoEstoque);
    }
}