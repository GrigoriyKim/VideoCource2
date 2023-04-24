package IO_NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class InterfacePath_ClassFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\Greek\\Pictures\\M");

        // method getFileName - vozvrashaet imya
        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());
        System.out.println("------------------------------");
        // method getParent - vozvrashaet imya roditelya
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());
        System.out.println("------------------------------");
        // method getRoot - vozvrashaet imya kornya
        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());
        System.out.println("------------------------------");
        // method isAbsolute - vozvrashaet otvet absolyutniy li put
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());
        System.out.println("------------------------------");
        // method toAbsolutePath - vozvrashaet polniy absolyutniy(perevodit v absolyutniy daje otnositelniy)  put
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());
        System.out.println("------------------------------");
        // method toAbsolutePath.getParent() - vozvrashaet polniy absolyutniy put roditelya
        System.out.println("filePath.toAbsolutePath().getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.toAbsolutePath().getParent() " + directoryPath.toAbsolutePath().getParent());
        System.out.println("------------------------------");
        // method toAbsolutePath.getRoot() - vozvrashaet polniy absolyutniy put kornya
        System.out.println("filePath.toAbsolutePath().getRoot() " + filePath.toAbsolutePath().getRoot());
        System.out.println("directoryPath.toAbsolutePath().getRoot() " + directoryPath.toAbsolutePath().getRoot());
        System.out.println("------------------------------");
        // method resolve - ob`edinyaet 2 puti v odin
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));
        System.out.println("------------------------------");
        // method relativize - vozvrashaet otnositelniy put
        Path anotherPath = Paths.get("C:\\Users\\Greek\\Pictures\\M\\N\\Z\\test20.txt");
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.relativize(anotherPath));
        System.out.println("------------------------------");
        // method exists - proveryaet sushestvuet li dannit fayl
        // method createFile - sozdayot ukazanniy fayl
        if (!Files.exists(filePath)){
            Files.createFile(filePath);
            System.out.println("Done File create");
        }
        // method createDirectories - sozdayot ukazannuyu directoriyu
        if (!Files.exists(directoryPath)){
            Files.createDirectories(directoryPath);
            System.out.println("Done Directory create");
        }

        // method isReadable - proveryaet est li prava na chteniye
        System.out.println("Files.isReadable(filePath) " + Files.isReadable(filePath));
        // method isWritable - proveryaet est li prava na zapis
        System.out.println("Files.isWritable(filePath) " + Files.isWritable(filePath));
        // method isExecutable - proveryaet est li prava na ispolneniye/ispolzovaniye
        System.out.println("Files.isExecutable(filePath) " + Files.isExecutable(filePath));
        System.out.println("------------------------------");

        // method isSameFile - sravnivayet puti 2-x faylov
        Path filePath2 = Paths.get("C:\\Users\\Greek\\IdeaProjects\\VideoCource2\\test15.txt");
        System.out.println("Files.isSameFile(filePath, filePath2) " + Files.isSameFile(filePath, filePath2));
        System.out.println("------------------------------");

        // method size - vozvrashaet razmer faila v byte
        System.out.println("Files.size(filePath) " + Files.size(filePath) + " Byte");
        System.out.println("------------------------------");
        // method getAttribute - vozvrashaet Attribute faila v nashem sluchae vremya sozdaniya
        System.out.println("Files.getAttribute(filePath, \"creationTime\") " + Files.getAttribute(filePath, "creationTime"));
        System.out.println("------------------------------");
        // method getAttribute - vozvrashaet Attribute faila v nashem sluchae razmer
        System.out.println("Files.getAttribute(filePath, \"size\") " + Files.getAttribute(filePath, "size"));
        System.out.println("------------------------------");
        // method readAttributes - vozvrashaet vse bazovie Attribute faila
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------------");

    }
}
