import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas1 {

    public static Map<String, List<Pessoa1>> obterPessoasPorCargo(List<Pessoa1> pessoa1s) {
        return pessoa1s.stream().collect(
                Collectors.groupingBy(Pessoa1::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa1> pessoa1s) {
        return pessoa1s.stream().collect(
                Collectors.groupingBy(Pessoa1::getCargo,
                        Collectors.mapping(Pessoa1::getIdade, Collectors.toList()))
        );
    }
}
