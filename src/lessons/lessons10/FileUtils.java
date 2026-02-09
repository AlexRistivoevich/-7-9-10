package lessons.lessons10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public static void writeToFile(String filePath, String text) throws IOException {
        Files.writeString(
                Path.of(filePath),
                text,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
        );
    }

    public static void mergeFiles(String file1, String file2, String resultFile) throws IOException {
        List<String> lines1 = readFile(file1);
        List<String> lines2 = readFile(file2);
        for (String line : lines1) {
            writeToFile(resultFile, line + System.lineSeparator());
        }
        for (String line : lines2) {
            writeToFile(resultFile, line + System.lineSeparator());
        }
    }

    public static void replaceSymbols(String filePath) throws IOException {
        String content = Files.readString(Path.of(filePath));
        String modified = content.replaceAll("[^a-zA-Zа-яА-Я0-9]", "\\$");

        Files.writeString(
                Path.of(filePath),
                modified,
                StandardOpenOption.TRUNCATE_EXISTING
        );
    }
}
