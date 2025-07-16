public class Comida0 {
    private String nome;
    private double calorias;
    private double preco;

    public Comida0(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f R$ %f", this.nome, this.calorias, this.preco);
    }
}
