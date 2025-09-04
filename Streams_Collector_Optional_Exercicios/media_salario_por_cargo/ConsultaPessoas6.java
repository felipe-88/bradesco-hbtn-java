import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas6 {

    public static Map<String, List<Pessoa6>> obterPessoasPorCargo(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(Pessoa6::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(Pessoa6::getCargo,
                        Collectors.mapping(Pessoa6::getIdade, Collectors.toList()))
        );
    }

    public static Map<String, List<Pessoa6>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(Pessoa6::getCargo,
                        Collectors.filtering(pessoa65432 -> pessoa65432.getIdade() > 40, Collectors.toList()))
        );
    }

    public static TreeMap<String, TreeSet<Pessoa6>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(
                        Pessoa6::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new))
        );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(
                        Pessoa6::getCargo,
                        Collectors.counting()
                )
        );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(
                        Pessoa6::getCargo,
                        Collectors.groupingBy(
                                Pessoa6::getIdade,
                                Collectors.counting()
                        )
                )
        );
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa6> pessoa6s) {
        return pessoa6s.stream().collect(
                Collectors.groupingBy(
                        Pessoa6::getCargo,
                        Collectors.averagingDouble(Pessoa6::getSalario)
                )
        );
    }
}
