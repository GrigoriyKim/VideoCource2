package IO_Ex.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "МНе известно, что мне нечего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "Privet";
        FileWriter writer = null;
        try {
//            writer = new FileWriter("C:\\Java_File\\test1.txt");
            // dobavlenie true 2 peremennoy pozvolyaet dobavit text k imeyeshimsya dannim bez stiraniya
            writer = new FileWriter("test2.txt", true);

//            // 1 variant sozdaniya zapisi
//            for (int i = 0; i < rubai.length(); i++){
//                writer.write(rubai.charAt(i));
//            }

//            // 2 variant sozdaniya zapisi
//            writer.write(rubai);

//            // method write proizodit perezapis faila txt
            writer.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // esli ne zakrit stream - to fail ne zapolnitsya
            writer.close();
        }
    }
}
