import java.util.*;

public class Program34 {
    public static void main(String[] args) {
        Pessoa2 pessoa21 = new Pessoa2(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa2 pessoa2 = new Pessoa2(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa2 pessoa23 = new Pessoa2(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa2 pessoa24 = new Pessoa2(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa2 pessoa25 = new Pessoa2(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa2 pessoa26 = new Pessoa2(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa2 pessoa27 = new Pessoa2(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa2 pessoa28 = new Pessoa2(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa2 pessoa29 = new Pessoa2(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa2 pessoa210 = new Pessoa2(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa2> todasPessoa2s = List.of(pessoa21, pessoa2, pessoa23, pessoa24, pessoa25,
                pessoa26, pessoa27, pessoa28, pessoa29, pessoa210);

        Map<String, List<Pessoa2>> pessoas1 = ConsultaPessoas2.obterPessoasPorCargoAcimaDe40anos(todasPessoa2s);
        Map<String, List<Pessoa2>> pessoas2 = ConsultaPessoas2.obterPessoasPorCargoAcimaDe40anos(
                List.of(pessoa21, pessoa24, pessoa210)
        );
        Map<String, List<Pessoa2>> pessoas3 = ConsultaPessoas2.obterPessoasPorCargoAcimaDe40anos(
                List.of(pessoa24, pessoa29)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}