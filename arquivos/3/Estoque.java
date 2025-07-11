import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String fileName = "estoque.csv";
    private List<String> leitura = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();
    private String root = System.getProperty("user.dir");
    //private String path = root + File.separator + "arquivos" + File.separator + "3" + File.separator + fileName;
    private String path = "/home/student_jail/student_repo/arquivos/3/estoque.csv";

    public Estoque(String fileName) {
        this.fileName = fileName;
    }

    private void leitura() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            leitura = reader.lines().toList();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            convert();
        }
    }

    private void convert() {
        if (!leitura.isEmpty()) {
            produtos = new ArrayList<>(leitura.stream().map(l -> {
                String[] split = l.split(",");
                return new Produto(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3]));
            }).toList());
        }
    }

    private void  gravacao() {
        produtos.forEach(produto -> {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
                writer.write(produto.toCsv());
                writer.newLine();
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

        actions("A", nome, quantidade, preco);
    }

    public void excluirProduto(int idExcluir) {
        if (idExcluir <= 0)
            throw new IllegalArgumentException("Digite um id válido");
        actions("X", idExcluir);
    }

    public void exibirEstoque() {
        leitura();
        produtos.forEach(p -> System.out.println(p.toString()));
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        if(novaQuantidade <= 0)
            throw new IllegalArgumentException("Digite uma quantidade maior que zero");
        actions("U", idAtualizar, novaQuantidade);
    }

    private void actions(String op, Object... params) {
        leitura();
        switch (op) {
            case "A" ->  {
                int id = gerarId();
                produtos.add(new Produto(id,
                    params[0].toString(),
                    Integer.parseInt(params[1].toString()),
                    Double.parseDouble(params[2].toString())));
            }
            case "X" -> produtos.removeIf(produto ->  produto.getId() == Integer.parseInt(params[0].toString()));
            case "U" -> {
                int index = Integer.parseInt(params[0].toString());
                Produto produto = produtos.stream()
                        .filter(produto1 -> produto1.getId() == index)
                        .findFirst()
                        .orElse(new Produto(0, "nao_existe", 0, 0D));
                if (!produto.getNome().equals("nao_existe")) {
                    produto.setQuantidade(Integer.parseInt(params[1].toString()));
                    produtos.add(index, produto);
                }
            }
        }
        gravacao();
    }
}
