import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


        // implemente o codigo aqui
        System.out.print("Digite o texto, após o término digite \"sair\": ");
        while (!scanner.nextLine().equals("sair")) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
                writer.write(scanner.nextLine());
                writer.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        scanner.close();
    }
}
