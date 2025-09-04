import java.util.*;

public class Program36 {
    public static void main(String[] args) {
        Pessoa4 pessoa41 = new Pessoa4(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa4 pessoa42 = new Pessoa4(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa4 pessoa43 = new Pessoa4(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa4 pessoa4 = new Pessoa4(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa4 pessoa45 = new Pessoa4(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa4 pessoa46 = new Pessoa4(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa4 pessoa47 = new Pessoa4(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa4 pessoa48 = new Pessoa4(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa4 pessoa49 = new Pessoa4(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa4 pessoa410 = new Pessoa4(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa4> todasPessoa4s = List.of(pessoa41, pessoa42, pessoa43, pessoa4, pessoa45,
                pessoa46, pessoa47, pessoa48, pessoa49, pessoa410);

        Map<String, Long> pessoas1 = ConsultaPessoas4.obterContagemPessoasPorCargo(todasPessoa4s);
        Map<String, Long> pessoas2 = ConsultaPessoas4.obterContagemPessoasPorCargo(
                List.of(pessoa41, pessoa42, pessoa43, pessoa4, pessoa49, pessoa410)
        );
        Map<String, Long> pessoas3 = ConsultaPessoas4.obterContagemPessoasPorCargo(
                List.of(pessoa41, pessoa43, pessoa4, pessoa45, pessoa49)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}