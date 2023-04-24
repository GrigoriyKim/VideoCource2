package IO_NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTree1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\Greek\\Pictures\\X");
        Files.walkFileTree(path, new MyFileVisitor());

    }
}

class MyFileVisitor implements FileVisitor<Path>{
    // znachenie CONtINUE - oznachaet, chto nujno prodoljat obhod po failam
    // znachenie TERMINATE - oznachaet, chto nujno nemedlenno prekratit obhod po failam
    // znachenie SKIP_SUBTREE - oznachaet, chto v dannuyu directoriyu zahodit ne nado
    // znachenie SIBLINGS - oznachaet, v dannoy directorii prodoljat obhod po failam ne nujno
    @Override
    // srabativaet kogda fail po kakim to prichinam nedostupen
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Error while visiting file: " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }
    @Override
    // srabativaet pered obrasheniem k elementam papki
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
    @Override
    // srabativaet pri obrashenii k failu
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    // srabativaet posle obrasheniya ko vsem elementam papki
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exit from Directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}