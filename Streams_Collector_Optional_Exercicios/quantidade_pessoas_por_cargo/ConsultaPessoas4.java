import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas4 {

    public static Map<String, List<Pessoa4>> obterPessoasPorCargo(List<Pessoa4> pessoa4s) {
        return pessoa4s.stream().collect(
                Collectors.groupingBy(Pessoa4::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa4> pessoa4s) {
        return pessoa4s.stream().collect(
                Collectors.groupingBy(Pessoa4::getCargo,
                        Collectors.mapping(Pessoa4::getIdade, Collectors.toList()))
        );
    }

    public static Map<String, List<Pessoa4>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa4> pessoa4s) {
        return pessoa4s.stream().collect(
                Collectors.groupingBy(Pessoa4::getCargo,
                        Collectors.filtering(pessoa432 -> pessoa432.getIdade() > 40, Collectors.toList()))
        );
    }

    public static TreeMap<String, TreeSet<Pessoa4>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa4> pessoa4s) {
        return pessoa4s.stream().collect(
                Collectors.groupingBy(
                        Pessoa4::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new))
        );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa4> pessoa4s) {
        return pessoa4s.stream().collect(
                Collectors.groupingBy(
                        Pessoa4::getCargo,
                        Collectors.counting()
                )
        );
    }
}
