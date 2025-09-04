import java.util.Locale;

public class Pessoa5 implements Comparable<Pessoa5> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa5(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format(new Locale("pt", "BR"), "[%d] %s %s %d R$ %f", this.codigo, this.nome, this.cargo, this.idade, this.salario);
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa5 o) {
        return this.nome.compareTo(o.nome);
    }
}
