package IO_Ex.work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesEx2 {
    public static void main(String[] args) throws IOException {
        // mojno dobavlat neskolko reader i writer
        // tak je TryWithResources pozvolyaet pisat TrueCatchFinally bez Catch i Finally
        // no esli nujna obrabotka isklyucheniya to neobxodimo pisat v catch obrabotku Exception
        try (FileReader reader = new FileReader("Test3.txt");
             FileWriter writer = new FileWriter("Test3.txt", true)) {
            int character;
            while((character = reader.read())!= -1){
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done!");
        }

    }
}