import java.util.*;

public class Program32 {
    public static void main(String[] args) {
        Pessoa0 pessoa01 = new Pessoa0(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa0 pessoa02 = new Pessoa0(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa0 pessoa03 = new Pessoa0(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa0 pessoa04 = new Pessoa0(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa0 pessoa05 = new Pessoa0(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa0 pessoa06 = new Pessoa0(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa0 pessoa07 = new Pessoa0(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa0 pessoa08 = new Pessoa0(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa0 pessoa09 = new Pessoa0(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa0 pessoa010 = new Pessoa0(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa0> todasPessoa0s = List.of(pessoa01, pessoa02, pessoa03, pessoa04, pessoa05,
                pessoa06, pessoa07, pessoa08, pessoa09, pessoa010);

        Map<String, List<Pessoa0>> pessoasPorCargo1 = ConsultaPessoas0.obterPessoasPorCargo(todasPessoa0s);
        Map<String, List<Pessoa0>> pessoasPorCargo2 = ConsultaPessoas0.obterPessoasPorCargo(
                List.of(pessoa01, pessoa04, pessoa010)
        );
        Map<String, List<Pessoa0>> pessoasPorCargo3 = ConsultaPessoas0.obterPessoasPorCargo(
                List.of(pessoa04, pessoa09)
        );

        System.out.println(pessoasPorCargo1);
        System.out.println();
        System.out.println(pessoasPorCargo2);
        System.out.println();
        System.out.println(pessoasPorCargo3);
    }
}