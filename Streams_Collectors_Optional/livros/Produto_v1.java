public class Produto_v1 {
    private int codigo;
    private String nome;
    private CategoriaProduto_v1 categoria;
    private double preco;

    public Produto_v1(int codigo, String nome, CategoriaProduto_v1 categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto_v1 getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto_v1 categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s %s R$ %,.2f", this.codigo, this.nome, this.categoria, this.preco);
    }
}
