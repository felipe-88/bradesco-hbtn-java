import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class SistemaFilas {
    public static void main(String[] args) {
        Fila fila = new Fila(10);
        Produtor produtor1 = new Produtor(fila);
        Produtor produtor2 = new Produtor(fila);
        Consumidor consumidor1 = new Consumidor(fila);
        Consumidor consumidor2 = new Consumidor(fila);
        produtor1.start();
        consumidor1.start();
        produtor2.start();
        consumidor2.start();
        produtor1.run();
        consumidor1.run();
        produtor2.run();
        consumidor2.run();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        }, 20000, 1000);
    }
}
