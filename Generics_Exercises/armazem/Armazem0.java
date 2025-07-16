import java.util.HashMap;
import java.util.Map;

public class Armazem0<T> implements Armazenavel0<T> {
    private Map<String, T> itens = new HashMap<>();

    public Armazem0() {
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
