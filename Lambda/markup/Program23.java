public class Program23 {
    public static void main(String[] args) {
        Produto__ produto1 = new Produto__(129.99, "Mouse Gamer");

        System.out.printf("%s - %.2f - %.2f\n", produto1.getNome(),
                produto1.getPreco(),
                produto1.precoComMarkup.get());

        produto1.atualizarMarkup.accept(15d);

        System.out.printf("%s - %.2f - %.2f\n", produto1.getNome(),
                produto1.getPreco(),
                produto1.precoComMarkup.get());
    }
}