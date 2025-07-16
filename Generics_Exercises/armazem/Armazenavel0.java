public interface Armazenavel0<T> {
    void adicionarAoInventario(String nome, T valor);
    T obterDoInventario(String nome);
}
