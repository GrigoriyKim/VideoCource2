package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt_Intermediate {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        // method mapToInt - vozvrashaet strem v tipe int (vivod [3, 2, 1, 4, 3])
        // method mapToDouble - vozvrashaet strem v tipe double (vivod [8.3, 6.4, 8.9, 7.0, 7.4])
        // method boxed - convertiruet v obertku (int v Integer, double v Double)
        List<Integer> courses = students.stream()
                .mapToInt(el -> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);
        List<Double> avgGrades = students.stream()
                .mapToDouble(el -> el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(avgGrades);

        // method sum = skladivaet vse elementi stream (vivod sum[3, 2, 1, 4, 3] = 13)
        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        // method average - vozvrashaet srednee arifmeticheskoe znachenie
        // method getAsDouble - prevrashaet stream v double tak kak otvet mojet bit drobnim
        // vivod = [3, 2, 1, 4, 3] = 13 / 5 = 2.6
        double average = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(average);

        // method min - vozvrashaet min element stream
        // method max - vozvrashaet max element stream
        // method getAsInt - prevrashaet stream v int tak kak otvet int
        int min = students.stream().mapToInt(el -> el.getCourse())
                .min().getAsInt();
        System.out.println(min);
        int max = students.stream().mapToInt(el -> el.getCourse())
                .max().getAsInt();
        System.out.println(max);
    }
}
