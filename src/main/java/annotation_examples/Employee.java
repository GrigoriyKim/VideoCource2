package annotation_examples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
@MyAnnotation
    public void increaseSalary(){
        salary*=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
// Annotaciya @Target - pokazivaet oblast koda, k kotoroy Annotaciya mojet bit primenima
@Target({ElementType.TYPE, ElementType.METHOD})
// Annotaciya @Retention - opisivaet jiznenniy cikl
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{

}