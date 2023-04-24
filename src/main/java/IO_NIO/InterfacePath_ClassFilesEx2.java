package IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class InterfacePath_ClassFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Greek\\Pictures\\M");
        Path directoryBPath = Paths.get("C:\\Users\\Greek\\Pictures\\B");

//        // method copy = kopiruet fayl
////        Files.copy(filePath, directoryPath.resolve(filePath));
////        Files.copy(filePath, directoryPath.resolve("test16.txt"));
//        // method StandardCopyOption.REPLACE_EXISTING - perezapisivayet fail
//        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//        // method copy - kopiruet tolko papku bez failov
//        Files.copy(directoryBPath, directoryPath.resolve("B"));
//        System.out.println("Done!");
//        // method move - peremeshyaet fail
//        Files.move(filePath, directoryPath.resolve("test15.txt"));
//        // method move - mojet pereimenovat fail pri uslovii peremesheniya fayla v etu je papku
//        Files.move(Paths.get("test10.txt"), (Paths.get("text11.txt")));
//        // method delete - udalyaet fail i papki pri uslovii chto papka pusta
//        Files.delete(Paths.get("test55.txt"));
        Files.delete(directoryBPath);

    }
}
