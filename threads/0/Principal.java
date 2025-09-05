public class Principal {
    public static void main(String[] args) {
        Contador contador = new Contador();
        ThreadContador t1 = new ThreadContador(contador);
        ThreadContador t2 = new ThreadContador(contador);
        t1.start();
//        t1.run();
        t1.interrupt();
        t2.start();
//        t2.run();
        t2.interrupt();
        System.out.println("Valor final do contador: " + contador.getContagem());
    }
}
