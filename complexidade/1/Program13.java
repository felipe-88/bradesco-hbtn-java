public class Program13 {

    public static void main(String[] args) {
        long inicio  = System.nanoTime();
        try {
            PessoasArray1 p = new PessoasArray1();
            p.buscaLinear("Otavio");
            p.buscaLinear("Isabela");
            p.buscaLinear("Anderson");
        }finally {
            System.out.println("Tempo de execução: "+(System.nanoTime()-inicio));
        }
    }
}