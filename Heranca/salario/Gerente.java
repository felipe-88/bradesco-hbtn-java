public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    public double calcularBonus(Departamento departamento) {
        return departamento.alcancouMeta() ? (super.getSalarioFixo() * 0.2) + diferenca(departamento) : 0;
    }

    public double diferenca(Departamento departamento) {
        return (departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01;
    }
}
