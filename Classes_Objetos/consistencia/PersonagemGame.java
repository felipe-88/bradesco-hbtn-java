import java.util.Objects;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        status = saudeAtual > 0 ? "vivo" : "morto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = (Objects.isNull(nome) || nome.isEmpty()) ? this.nome : nome;
    }

    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(Math.max(saudeAtual - quantidadeDeDano, 0));
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(Math.min(saudeAtual + quantidadeDeCura, 100));
    }
}
