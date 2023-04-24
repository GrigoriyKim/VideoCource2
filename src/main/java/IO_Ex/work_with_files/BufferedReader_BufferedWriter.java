package IO_Ex.work_with_files;

import java.io.*;
// CopyEx
public class BufferedReader_BufferedWriter {
    // BufferedReader obrashaetsya k faylu i zapisivaet vmachale vse simvoli(ili ckolko hvatit bufera) v bufer is fayla a potom posimvolno schitivaet
    // BufferedWriter zapisivaet vmachale vse simvoli(ili ckolko hvatit bufera) v bufer is programmi a potom obrashaetsya k faylu
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"));
        ){
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            String line;
            while ((line = reader.readLine())!= null){
                // kopiruet bez perehoda stroki
                writer.write(line);
                // dobavim perehod stroki
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
