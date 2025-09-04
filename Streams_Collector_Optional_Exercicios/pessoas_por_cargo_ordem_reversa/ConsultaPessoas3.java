import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas3 {

    public static Map<String, List<Pessoa3>> obterPessoasPorCargo(List<Pessoa3> pessoa3s) {
        return pessoa3s.stream().collect(
                Collectors.groupingBy(Pessoa3::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa3> pessoa3s) {
        return pessoa3s.stream().collect(
                Collectors.groupingBy(Pessoa3::getCargo,
                        Collectors.mapping(Pessoa3::getIdade, Collectors.toList()))
        );
    }

    public static Map<String, List<Pessoa3>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa3> pessoa3s) {
        return pessoa3s.stream().collect(
                Collectors.groupingBy(Pessoa3::getCargo,
                        Collectors.filtering(pessoa32 -> pessoa32.getIdade() > 40, Collectors.toList()))
        );
    }

    public static TreeMap<String, TreeSet<Pessoa3>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa3> pessoa3s) {
        return pessoa3s.stream().collect(
                Collectors.groupingBy(
                        Pessoa3::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new))
        );
    }
}
