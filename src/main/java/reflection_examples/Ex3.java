package reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true); // pozvolyaet poluchit dostup k private (ranee bez etoy stroki vidaval IllegalAccessException)
        double salaryValue = (Double) field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 1500); // pozvolyaet izmenit private pole
        System.out.println(employee);
    }
}
