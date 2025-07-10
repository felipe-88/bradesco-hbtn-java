package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {

        return new Frete(peso > 5000D ? valor * 0.12 : valor * 0.04,
                TipoProvedorFrete.LOGGI);
    }
}
