public class Eletronico0 {
    private String descricao;
    private double valor;

    public Eletronico0(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("[%s] R$ %f", this.descricao, this.valor);
    }
}
