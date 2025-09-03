import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas0 {

    public static Map<String, List<Pessoa0>> obterPessoasPorCargo(List<Pessoa0> pessoa0s) {
        return pessoa0s.stream().collect(
                Collectors.groupingBy(Pessoa0::getCargo)
        );
    }
}
