package IO_Ex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file
                = new RandomAccessFile("test10.txt", "rw")){

            // method read - chitaet simvol
            int a = file.read();
            System.out.println((char) a);
            // method readLine - chitaet stroku
            String s1 = file.readLine();
            System.out.println(s1);
            // method seek - perenosit kursor na ukazanniy simvol
            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);
            // method getFilePointer pokazivaet na kakoy pozicii nahoditsya kursor
            long pointer = file.getFilePointer();
            System.out.println(pointer);
//            // method writeBytes - perezapisivaet String poverh imeyushegosya teksta
//            file.seek(0);
//            file.writeBytes("privet");
            file.seek(file.length()-1);
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
