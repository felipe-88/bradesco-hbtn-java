import java.util.Locale;

public class Program16 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Comida0 comida01 = new Comida0("arroz", 100, 15.9);
        Comida0 comida02 = new Comida0("feijao", 80, 23.0);
        Comida0 comida03 = new Comida0("pacoca", 165, 7.5);

        Eletronico0 eletronico01 = new Eletronico0("Smart TV LED 32 HD LG", 1452.55);
        Eletronico0 eletronico02 = new Eletronico0("Nintendo Switch", 2990);

        Armazem0<Eletronico0> armazem01 = new Armazem0<>();
        armazem01.adicionarAoInventario("TV LG", eletronico01);
        armazem01.adicionarAoInventario("Switch", eletronico02);

        Eletronico0 eletronico0Buscado1 = armazem01.obterDoInventario("Switch");

        System.out.println(eletronico0Buscado1);

        Armazem0<Comida0> armazem02 = new Armazem0<>();
        armazem02.adicionarAoInventario("feijao", comida02);
        armazem02.adicionarAoInventario("pacoca", comida03);

        Comida0 comida0Buscada1 = armazem02.obterDoInventario("feijao");

        System.out.println(comida0Buscada1);
    }
}