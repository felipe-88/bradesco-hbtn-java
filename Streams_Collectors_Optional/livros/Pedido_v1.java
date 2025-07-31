import java.util.List;

public class Pedido_v1 {
    private int codigo;
    private List<Produto_v1> produtoV1s;
    private Cliente_v1 clienteV1;

    public Pedido_v1(int codigo, List<Produto_v1> produtoV1s, Cliente_v1 clienteV1) {
        this.codigo = codigo;
        this.produtoV1s = produtoV1s;
        this.clienteV1 = clienteV1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto_v1> getProdutos() {
        return produtoV1s;
    }

    public void setProdutos(List<Produto_v1> produtoV1s) {
        this.produtoV1s = produtoV1s;
    }

    public Cliente_v1 getCliente() {
        return clienteV1;
    }

    public void setCliente(Cliente_v1 clienteV1) {
        this.clienteV1 = clienteV1;
    }
}
