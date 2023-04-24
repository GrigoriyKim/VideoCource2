package IO_Ex.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesEx1 {
    public static void main(String[] args) throws IOException {
        // tak je mojno izmenit FileReaderEx
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "МНе известно, что мне нечего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "privet";

        try (FileWriter writer = new FileWriter("Test3.txt", true)) {
            for (int i = 0; i < rubai.length(); i++){
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
