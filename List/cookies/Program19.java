public class Program19 {
    public static void main(String[] args) {
        Pedido_old1 pedidoOld1 = new Pedido_old1();

        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Chocolate", 10));
        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Nutella", 3));
        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Baunilha", 2));

        System.out.println(String.format("Total: %d", pedidoOld1.obterTotalCaixas()));

        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Chocolate", 1));
        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Nutella", 1));

        System.out.println(String.format("Total: %d", pedidoOld1.obterTotalCaixas()));

        int quantidadeRemovidos = pedidoOld1.removerSabor("Nutella");

        System.out.println(String.format("Total: %d - Removidos: %d", pedidoOld1.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedidoOld1.removerSabor("Chocolate");

        System.out.println(String.format("Total: %d - Removidos: %d", pedidoOld1.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedidoOld1.removerSabor("Baunilha");

        System.out.println(String.format("Total: %d - Removidos: %d", pedidoOld1.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedidoOld1.removerSabor("Chocolate");

        System.out.println(String.format("Total: %d - Removidos: %d", pedidoOld1.obterTotalCaixas(), quantidadeRemovidos));

        pedidoOld1.adicionarPedidoCookie(new PedidoCookie("Nutella", 5));

        System.out.println(String.format("Total: %d", pedidoOld1.obterTotalCaixas()));
    }
}