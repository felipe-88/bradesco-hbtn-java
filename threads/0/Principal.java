public class Principal {

    static Contador contador = new Contador();
    static ThreadContador t1 = new ThreadContador(contador);
    static ThreadContador t2 = new ThreadContador(contador);

    public static void main(String[] args) {

        t1.run();
        t2.run();
        t1.interrupt();
        t2.interrupt();
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
