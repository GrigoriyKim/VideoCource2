package IO_Ex;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\Greek\\Pictures\\A");
        File file2 = new File("C:\\Users\\Greek\\Pictures\\A\\test1.txt");
        File folder2 = new File("C:\\Users\\Greek\\Pictures\\B");
        // method getAbsolutePath - pokazivaet put k faylu
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() " + folder.getAbsolutePath());
        System.out.println("-------------------------------");
        // method isAbsolute - proveryaet absolyutniy li put
        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("folder.isAbsolute() " + folder.isAbsolute());
        System.out.println("-------------------------------");
        // method isDirectory - proveryaet papka eto ili net
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("folder.isDirectory() " + folder.isDirectory());
        System.out.println("-------------------------------");
        // method exists - proveryaet sushextvuyet fail ili net
        System.out.println("file.exists() " + file.exists());
        System.out.println("folder.exists() " + folder.exists());
        System.out.println("folder2.exists() " + folder2.exists());
        System.out.println("file2.exists() " + file2.exists());
        System.out.println("-------------------------------");
        // method createNewFile - sozdayet fail
        // method mkdir - sozdayet papku
        System.out.println("file2.createNewFile() " + file2.createNewFile());
        System.out.println("folder2.mkdir() " + folder2.mkdir());
        System.out.println("-------------------------------");
        // method length - vivodit ves fayla
        // method length - dlya papki takoy funkcii net - nujno sozdat method samomu
        System.out.println("file2.length() " + file2.length());
        System.out.println("folder.length() " + folder.length());
        System.out.println("-------------------------------");
//        // method delete - udalyaet fayli i papki (pri uslovii chto papka ne pusta)
//        System.out.println("folder.delete() " + folder.delete());
//        System.out.println("folder2.delete() " + folder2.delete());
//        System.out.println("file2.delete() " + file2.delete());
//        System.out.println("-------------------------------");
        // method listFiles - vozvrashayet massiv tipa fail
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("-------------------------------");
        // method isHidden - vozvrashaet rezultat skrita li papka
        System.out.println("file2.isHidden() " + file2.isHidden());
        System.out.println("-------------------------------");
        // method canRead - est li dostup na chtenie faila
        System.out.println("file2.canRead() " + file2.canRead());
        // method canRead - est li dostup na zapis v etot fail
        System.out.println("file2.canWrite() " + file2.canWrite());
        // method canRead - est li dostup na zapusk etogo faila
        System.out.println("file2.canExecute() " + file2.canExecute());
    }
}
