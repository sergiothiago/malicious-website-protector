package service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreatorService {

    // Caminho do arquivo
    public static final String FILE_PATH = "myFile.txt";

    // Método para adicionar uma linha ao arquivo
    public static void addLine(String content) {
        try {
            Path path = Paths.get(FILE_PATH);

            // Verifica se o arquivo existe; se não, cria um novo
            createFileIfNotExists(path);

            // Adiciona uma nova linha no final do arquivo
            addNewLineEndOfFile(content);

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.getMessage());
        }
    }

    private static void addNewLineEndOfFile(String content) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(content + "\n");
            System.out.println("Conteudo adicionado ao arquivo com sucesso.");
        }
    }

    private static void createFileIfNotExists(Path path) throws IOException {
        if (!Files.exists(path)) {
            Files.createFile(path);
            System.out.println("Arquivo criado: " + FILE_PATH);
        }
    }

}
