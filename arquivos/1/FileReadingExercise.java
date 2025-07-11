import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingExercise {
    public static void main(String[] args) {
        String fileName = "exemplo.txt"; // Nome do arquivo fixo para leitura


        // efetue a leitura do arquivo
        System.out.println("Conteúdo do arquivo 'exemplo.txt':");
        try(BufferedReader reader = new BufferedReader(new FileReader("arquivos/1/"+fileName))) {
            reader.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Leitura do arquivo concluída.");
    }
}