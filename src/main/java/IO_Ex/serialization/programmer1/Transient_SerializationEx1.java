package IO_Ex.serialization.programmer1;

import java.io.*;

public class Transient_SerializationEx1 {
    public static void main(String[] args) {
        Car car = new Car("Nissan Tilda", "white");
        Transient_Employee transientEmp = new Transient_Employee("Mariya", "Ivanova",
                "IT",
//                28,
                500,
                car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Transient_employee1.bin"))
        ){
            outputStream.writeObject(transientEmp);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}