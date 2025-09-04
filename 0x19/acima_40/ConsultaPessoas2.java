import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas2 {

    public static Map<String, List<Pessoa2>> obterPessoasPorCargo(List<Pessoa2> pessoa2s) {
        return pessoa2s.stream().collect(
                Collectors.groupingBy(Pessoa2::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa2> pessoa2s) {
        return pessoa2s.stream().collect(
                Collectors.groupingBy(Pessoa2::getCargo,
                        Collectors.mapping(Pessoa2::getIdade, Collectors.toList()))
        );
    }

    public static Map<String, List<Pessoa2>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa2> pessoa2s) {
        return pessoa2s.stream().collect(
                Collectors.groupingBy(Pessoa2::getCargo,
                        Collectors.filtering(pessoa2 -> pessoa2.getIdade() > 40, Collectors.toList()))
        );
    }
}
