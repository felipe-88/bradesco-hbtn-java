public class Consumidor extends Thread {
    private Fila fila;

    public Consumidor(Fila fila) {
        this.fila = fila;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < this.fila.getTamanho(); i++) {
            try {
                this.fila.retirar();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
