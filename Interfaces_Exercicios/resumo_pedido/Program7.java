import provedores.JadLog;
import provedores.Loggi;
import provedores.Sedex;

import java.util.Locale;

public class Program7 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Pedido0 pedido01 = new Pedido0(1, 1500, 234.90);
        Pedido0 pedido02 = new Pedido0(2, 600, 124.00);
        Pedido0 pedido03 = new Pedido0(3, 3000, 53.00);
        Pedido0 pedido04 = new Pedido0(4, 7000, 300.00);

        ProcessadorPedido processadorPedidoSedex = new ProcessadorPedido(new Sedex());
        processadorPedidoSedex.processar(pedido01);

        System.out.printf("%s - %.2f\n", pedido01.getFrete().getTipoProvedorFrete(), pedido01.getFrete().getValor());

        ProcessadorPedido processadorPedidoJadLog = new ProcessadorPedido(new JadLog());
        processadorPedidoJadLog.processar(pedido01);

        System.out.printf("%s - %.2f\n", pedido01.getFrete().getTipoProvedorFrete(), pedido01.getFrete().getValor());

        ProcessadorPedido processadorPedidoLoggi = new ProcessadorPedido(new Loggi());
        processadorPedidoLoggi.processar(pedido01);

        System.out.printf("%s - %.2f\n", pedido01.getFrete().getTipoProvedorFrete(), pedido01.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido02);
        System.out.printf("%s - %.2f\n", pedido02.getFrete().getTipoProvedorFrete(), pedido02.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido02);
        System.out.printf("%s - %.2f\n", pedido02.getFrete().getTipoProvedorFrete(), pedido02.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido02);
        System.out.printf("%s - %.2f\n", pedido02.getFrete().getTipoProvedorFrete(), pedido02.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido03);
        System.out.printf("%s - %.2f\n", pedido03.getFrete().getTipoProvedorFrete(), pedido03.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido03);
        System.out.printf("%s - %.2f\n", pedido03.getFrete().getTipoProvedorFrete(), pedido03.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido03);
        System.out.printf("%s - %.2f\n", pedido03.getFrete().getTipoProvedorFrete(), pedido03.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido04);
        System.out.printf("%s - %.2f\n", pedido04.getFrete().getTipoProvedorFrete(), pedido04.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido04);
        System.out.printf("%s - %.2f\n", pedido04.getFrete().getTipoProvedorFrete(), pedido04.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido04);
        System.out.printf("%s - %.2f\n", pedido04.getFrete().getTipoProvedorFrete(), pedido04.getFrete().getValor());
    }
}
