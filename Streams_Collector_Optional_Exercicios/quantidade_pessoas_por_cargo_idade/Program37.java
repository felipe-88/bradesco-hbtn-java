import java.util.*;

public class Program37 {
    public static void main(String[] args) {
        Pessoa5 pessoa51 = new Pessoa5(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa5 pessoa52 = new Pessoa5(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa5 pessoa53 = new Pessoa5(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa5 pessoa54 = new Pessoa5(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa5 pessoa5 = new Pessoa5(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa5 pessoa56 = new Pessoa5(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa5 pessoa57 = new Pessoa5(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa5 pessoa58 = new Pessoa5(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa5 pessoa59 = new Pessoa5(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa5 pessoa510 = new Pessoa5(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa5> todasPessoa5s = List.of(pessoa51, pessoa52, pessoa53, pessoa54, pessoa5,
                pessoa56, pessoa57, pessoa58, pessoa59, pessoa510);

        Map<String, Map<Integer, Long>> pessoas1 = ConsultaPessoas5.obterContagemPessoasPorCargoEIdade(todasPessoa5s);
        Map<String, Map<Integer, Long>> pessoas2 = ConsultaPessoas5.obterContagemPessoasPorCargoEIdade(
                List.of(pessoa51, pessoa52, pessoa53, pessoa54, pessoa59, pessoa510)
        );
        Map<String, Map<Integer, Long>> pessoas3 = ConsultaPessoas5.obterContagemPessoasPorCargoEIdade(
                List.of(pessoa51, pessoa53, pessoa54, pessoa5, pessoa59)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}