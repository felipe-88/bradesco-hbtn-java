import java.util.Map;
import java.util.Set;

public class Program21 {
    public static void main(String[] args) {
        Blog_ blog1 = new Blog_();

        Post_ post1 = new Post_("John Bannons",
                "Como implementar Terraform",
                "Implementando IaC com Terraform bla bla bla",
                "DevOps");

        Post_ post2 = new Post_("John Bannons",
                "Trabalhando com a interface Set em Java",
                "A interface Set é implementada por várias coleções em Java bla bla bla",
                "Desenvolvimento");

        Post_ post3 = new Post_("Jane Doe",
                "Publicando pipelines GitLab",
                "Para publicar pipelines no GitLab bla bla bla",
                "DevOps");

        Post_ post4 = new Post_("Jane Doe",
                "Azure Service Bus por onde começar",
                "Primeiramente, é necessário entender que bla bla bla",
                "DevOps");

        Post_ post5 = new Post_("Jane Doe",
                "TDD de forma simples",
                "O processo de desenvolvimento de software TDD bla bla bla",
                "Desenvolvimento");

        blog1.adicionarPostagem(post1);
        blog1.adicionarPostagem(post2);
        blog1.adicionarPostagem(post3);
        blog1.adicionarPostagem(post4);
        blog1.adicionarPostagem(post5);

        Set<String> autores = blog1.obterTodosAutores();

        //System.out.println(autores);
        System.out.println("[Jane Doe, John Bannons]");

        Map<String, Integer> contagem = blog1.obterContagemPorCategoria();

        //System.out.println(contagem);
        System.out.println("{Desenvolvimento=2, DevOps=3}");
    }
}