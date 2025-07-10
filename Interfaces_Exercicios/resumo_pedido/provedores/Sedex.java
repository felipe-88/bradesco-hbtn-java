package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {

        return new Frete(peso > 1000D ? valor * 0.1 : valor * 0.05,
                TipoProvedorFrete.SEDEX);
    }
}
