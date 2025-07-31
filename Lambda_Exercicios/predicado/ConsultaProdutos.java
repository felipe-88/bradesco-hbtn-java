import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {

    public static List<Produto_old1> filtrar(List<Produto_old1> lista, Predicate<Produto_old1> criterioFiltro) {
        return lista.stream().filter(criterioFiltro).toList();
    }
}
