import java.util.*;

public class Program38 {
    public static void main(String[] args) {
        Pessoa6 pessoa61 = new Pessoa6(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa6 pessoa62 = new Pessoa6(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa6 pessoa63 = new Pessoa6(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa6 pessoa64 = new Pessoa6(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa6 pessoa65 = new Pessoa6(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa6 pessoa6 = new Pessoa6(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa6 pessoa67 = new Pessoa6(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa6 pessoa68 = new Pessoa6(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa6 pessoa69 = new Pessoa6(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa6 pessoa610 = new Pessoa6(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa6> todasPessoa6s = List.of(pessoa61, pessoa62, pessoa63, pessoa64, pessoa65,
                pessoa6, pessoa67, pessoa68, pessoa69, pessoa610);

        Map<String, Double> pessoas1 = ConsultaPessoas6.obterMediaSalarioPorCargo(todasPessoa6s);
        Map<String, Double> pessoas2 = ConsultaPessoas6.obterMediaSalarioPorCargo(
                List.of(pessoa61, pessoa62, pessoa63, pessoa64, pessoa69, pessoa610)
        );
        Map<String, Double> pessoas3 = ConsultaPessoas6.obterMediaSalarioPorCargo(
                List.of(pessoa61, pessoa63, pessoa64, pessoa65, pessoa69)
        );

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}