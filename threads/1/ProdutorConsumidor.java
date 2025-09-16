public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Produtor0 produtor0 = new Produtor0(buffer);
        Consumidor0 consumidor0 = new Consumidor0(buffer);
        produtor0.start();
        consumidor0.start();
        consumidor0.run();
        produtor0.run();
    }
}
