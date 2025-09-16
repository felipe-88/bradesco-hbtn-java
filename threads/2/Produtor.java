import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;

    public Produtor(Fila fila) {
        this.fila = fila;
    }

    private int getNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < this.fila.getTamanho(); i++) {
            try {
                this.fila.adicionar(getNumber());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
