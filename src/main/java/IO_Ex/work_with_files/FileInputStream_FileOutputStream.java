package IO_Ex.work_with_files;


import java.io.*;

// CopyEx2
public class FileInputStream_FileOutputStream {
    // FileInputStream i FileOutputStream ispolzuetsya dlya rabori s binarnimi faylami
    // rabota s bufferom tak je vozmojna cherez BufferedInputStream i BufferedOutputStream
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:" +
                "\\Users\\Greek\\Pictures\\photo_2022-12-28_19-03-54.jpg");
             FileOutputStream outputStream = new FileOutputStream("photo_2022-12-28_19-03-54.jpg");
        ){
            int i;
            while ((i = inputStream.read())!= -1){
                outputStream.write(i);
            }
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
