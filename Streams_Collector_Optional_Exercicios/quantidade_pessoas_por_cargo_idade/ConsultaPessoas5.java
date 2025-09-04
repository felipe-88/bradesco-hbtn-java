import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas5 {

    public static Map<String, List<Pessoa5>> obterPessoasPorCargo(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(Pessoa5::getCargo)
        );
    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(Pessoa5::getCargo,
                        Collectors.mapping(Pessoa5::getIdade, Collectors.toList()))
        );
    }

    public static Map<String, List<Pessoa5>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(Pessoa5::getCargo,
                        Collectors.filtering(pessoa5432 -> pessoa5432.getIdade() > 40, Collectors.toList()))
        );
    }

    public static TreeMap<String, TreeSet<Pessoa5>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(
                        Pessoa5::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new))
        );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(
                        Pessoa5::getCargo,
                        Collectors.counting()
                )
        );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa5> pessoa5s) {
        return pessoa5s.stream().collect(
                Collectors.groupingBy(
                        Pessoa5::getCargo,
                        Collectors.groupingBy(
                                Pessoa5::getIdade,
                                Collectors.counting()
                        )
                )
        );
    }
}
