package stream.chaining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEach_Terminal {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        // method forEach - udvoenie kajdogo elementa spiska
//        Arrays.stream(array).forEach(el -> {el *= 2; System.out.println(el);});
        // method forEach - vivod kajdogo elementa spiska
        Arrays.stream(array).forEach(el -> System.out.println(el));
        // (ukorochennaya versiya) method forEach - vivod kajdogo elementa spiska
        Arrays.stream(array).forEach(System.out::println);
        // ukorochennaya versiya vivoda na osnove methoda myMethod
        Arrays.stream(array).forEach(Utils::myMethod);
        // dlinnoe versiya vivoda na osnove methoda myMethod
        Arrays.stream(array).forEach(el -> Utils.myMethod(el));

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>(); // zdes doljen bit List
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        // redko no ispolzuetsya
        myStream.filter(element
                -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
                .collect(Collectors.toList());
    }
}

class Utils{
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}