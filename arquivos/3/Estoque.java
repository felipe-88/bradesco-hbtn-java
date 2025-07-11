import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String fileName;
    private List<String> leitura = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public Estoque(String fileName) {
        this.fileName = fileName;
    }

    private void leitura() {
        String root = System.getProperty("user.dir");
        String path = root + File.separator + "arquivos" + File.separator + "3" + File.separator + fileName;
        //try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
        try(BufferedReader reader = new BufferedReader(new FileReader("/home/student_jail/student_repo/arquivos/3/estoque.csv"))) {
            leitura = reader.lines().toList();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        convert();
    }

    private void convert() {
        if (!leitura.isEmpty()) {
            produtos = leitura.stream().map(l -> {
                String[] split = l.split(",");
                return new Produto(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3]));
            }).toList();
        }
    }

    private void  gravacao() {
        String root = System.getProperty("user.dir");
        String path = root + File.separator + "arquivos" + File.separator + "3" + File.separator + fileName;

        produtos.stream().forEach(produto -> {
            //try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("/home/student_jail/student_repo/arquivos/3/estoque.csv"))) {
                writer.write(String.format("%d,%s,%d,%.2f", produto.getId(), produto.getNome(), produto.getQuantidade(), produto.getPreco()));
                writer.newLine();;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }

    private int gerarId() {
        int id = 1;
        return produtos.isEmpty() ? id : produtos.get(produtos.size() - 1).getId() + id;
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        if(quantidade <= 0)
            throw new IllegalArgumentException("Digite uma quantidade maior que zero");
        if (preco <= 0D)
            throw new IllegalArgumentException("Digite um preço válido para o produto");

        leitura();
        produtos.add(new Produto(gerarId(), nome, quantidade, preco));
        gravacao();
    }

    public void excluirProduto(int idExcluir) {
        if (idExcluir <= 0)
            throw new IllegalArgumentException("Digite um id válido");
        leitura();
        produtos.remove(idExcluir);
    }

    public void exibirEstoque() {
        leitura();
        leitura.forEach(System.out::println);
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        if(novaQuantidade <= 0)
            throw new IllegalArgumentException("Digite uma quantidade maior que zero");
        leitura();
        Produto produto = produtos.get(idAtualizar);
        produto.setQuantidade(novaQuantidade);
        produtos.add(idAtualizar, produto);
    }
}
