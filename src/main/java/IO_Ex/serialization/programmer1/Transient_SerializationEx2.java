package IO_Ex.serialization.programmer1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Transient_SerializationEx2 {
    public static void main(String[] args) {
        Transient_Employee bestTransientEmp;
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("Transient_employee1.bin"))
        ){
            bestTransientEmp = (Transient_Employee) inputStream.readObject();
            System.out.println(bestTransientEmp);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
