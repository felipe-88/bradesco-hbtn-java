import provedores.Frete;

public class Pedido0 {
    private int codigo;
    private double peso;
    private double total;
    private Frete frete;

    public Pedido0(int codigo, double peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public double getPeso() {
        return peso;
    }

    public double getTotal() {
        return total;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
