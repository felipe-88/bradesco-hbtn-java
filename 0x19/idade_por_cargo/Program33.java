import java.util.*;

public class Program33 {
    public static void main(String[] args) {
        Pessoa1 pessoa1 = new Pessoa1(1, "John Bannins", "Desenvolvedor", 23, 3200);
        Pessoa1 pessoa12 = new Pessoa1(2, "Derry Collier", "Desenvolvedor", 45, 8600);
        Pessoa1 pessoa13 = new Pessoa1(3, "Mikey Berg", "Product Owner", 51, 11350);
        Pessoa1 pessoa14 = new Pessoa1(4, "Diana Hayes", "Product Owner", 33, 7400);
        Pessoa1 pessoa15 = new Pessoa1(5, "Ellen Costa", "Product Owner", 51, 12500);
        Pessoa1 pessoa16 = new Pessoa1(6, "Jane Doe", "Analista QA", 42, 5200);
        Pessoa1 pessoa17 = new Pessoa1(7, "Haseeb Roche", "Analista QA", 21, 3200);
        Pessoa1 pessoa18 = new Pessoa1(8, "Jadene Everett", "Analista QA", 39, 4860);
        Pessoa1 pessoa19 = new Pessoa1(9, "Andrei Melendez", "Analista QA", 42, 5330);
        Pessoa1 pessoa110 = new Pessoa1(10, "Branden Irwin", "Analista QA", 21, 2800);

        List<Pessoa1> todasPessoa1s = List.of(pessoa1, pessoa12, pessoa13, pessoa14, pessoa15,
                pessoa16, pessoa17, pessoa18, pessoa19, pessoa110);

        Map<String, List<Integer>> idadesPorCargo1 = ConsultaPessoas1.obterIdadePorCargo(todasPessoa1s);
        Map<String, List<Integer>> idadesPorCargo2 = ConsultaPessoas1.obterIdadePorCargo(
                List.of(pessoa1, pessoa14, pessoa110)
        );
        Map<String, List<Integer>> idadesPorCargo3 = ConsultaPessoas1.obterIdadePorCargo(
                List.of(pessoa14, pessoa19)
        );

        System.out.println(idadesPorCargo1);
        System.out.println();
        System.out.println(idadesPorCargo2);
        System.out.println();
        System.out.println(idadesPorCargo3);
    }
}