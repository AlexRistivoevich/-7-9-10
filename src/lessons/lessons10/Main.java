package lessons.lessons10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtils.mergeFiles("file1.txt", "file2.txt", "result.txt");
        FileUtils.replaceSymbols("result.txt");
        System.out.println("Готово , файлы склеены и обработаны");
    }
}
