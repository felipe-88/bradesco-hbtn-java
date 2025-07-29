import java.util.List;

public class ConsultaProdutos_ {

    public static List<Produto_old> filtrar(List<Produto_old> lista, CriterioFiltro_ criterioFiltro) {
        return lista.stream().filter(criterioFiltro::testar).toList();
    }
}
