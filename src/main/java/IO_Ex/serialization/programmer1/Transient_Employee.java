package IO_Ex.serialization.programmer1;

import java.io.Serializable;

public class Transient_Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
//    int age;
    transient double salary;
    Car car;

    public Transient_Employee(String name,
                              String surname,
                              String department,
//                              int age,
                              double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
//        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Transient_Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
//                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}