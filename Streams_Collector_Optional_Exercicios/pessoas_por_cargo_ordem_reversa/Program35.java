import java.util.*;

public class Program35 {
    public static void main(String[] args) {
        Pessoa3 pessoa31 = new Pessoa3(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa3 pessoa32 = new Pessoa3(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa3 pessoa3 = new Pessoa3(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa3 pessoa34 = new Pessoa3(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa3 pessoa35 = new Pessoa3(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa3 pessoa36 = new Pessoa3(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa3 pessoa37 = new Pessoa3(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa3 pessoa38 = new Pessoa3(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa3 pessoa39 = new Pessoa3(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa3 pessoa310 = new Pessoa3(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa3> todasPessoa3s = List.of(pessoa31, pessoa32, pessoa3, pessoa34, pessoa35,
                pessoa36, pessoa37, pessoa38, pessoa39, pessoa310);

        TreeMap<String, TreeSet<Pessoa3>> pessoas1 = ConsultaPessoas3.obterPessoasAgrupadasPorCargoEmOrdemReversa(todasPessoa3s);
        TreeMap<String, TreeSet<Pessoa3>> pessoas2 = ConsultaPessoas3.obterPessoasAgrupadasPorCargoEmOrdemReversa(
                List.of(pessoa31, pessoa32, pessoa3, pessoa34, pessoa39, pessoa310)
        );
        TreeMap<String, TreeSet<Pessoa3>> pessoas3 = ConsultaPessoas3.obterPessoasAgrupadasPorCargoEmOrdemReversa(
                List.of(pessoa31, pessoa3, pessoa34, pessoa35, pessoa39)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}