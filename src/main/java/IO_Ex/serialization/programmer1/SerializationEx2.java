package IO_Ex.serialization.programmer1;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        // esli ne implementirovat Serializable budet vibivat Exception po etomo implementireem v klasse Employee
        Car car = new Car("Nissan Tilda", "white");
        Employee employee = new Employee("Mariya", "IT", 28, 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employee2.bin"))
                ){
            outputStream.writeObject(employee);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
