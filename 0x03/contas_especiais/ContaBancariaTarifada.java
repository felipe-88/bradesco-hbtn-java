import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        this.setSaldo(this.getSaldo() - 0.1D);
        this.quantidadeTransacoes++;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        this.setSaldo(this.getSaldo() - 0.1D);
        this.quantidadeTransacoes++;
    }
}
