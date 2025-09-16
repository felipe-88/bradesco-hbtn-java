import java.util.LinkedList;

public class Fila {

    private LinkedList<Integer> fila = new LinkedList<>();
    private int tamanho;

    public Fila(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public synchronized void adicionar(int item) throws InterruptedException {
        if (fila.size() == tamanho)
            wait();
        else {
            fila.add(item);
            notify();
        }
    }

    public synchronized void retirar() throws InterruptedException {
        if(fila.isEmpty())
            wait();
        else {
            fila.removeFirst();
            notify();
        }
    }
}
