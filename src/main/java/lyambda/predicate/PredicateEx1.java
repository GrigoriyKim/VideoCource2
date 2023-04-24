package lyambda.predicate;

import lyambda.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class PredicateEx1 {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for (Student s : al) {
            if (pr.test(s)){
                System.out.println(s);
            }
        }
    }
}

class Test1{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        // anonimniy klass
        PredicateEx1 info = new PredicateEx1();
//        // lyambda virajenie

//        // klasicheskiy vid
//        info.testStudents(students, (Student p) -> {return p.age>30;});
        Predicate<Student> p1 = student -> {return student.avgGrade > 7.5;};
        Predicate<Student> p2 = student -> {return student.sex == 'm';};
        // method and - obedinyaet 2 proverki
//        info.testStudents(students, p1.and(p2));
        // method or - vivodit vse elementi kotorie udovletvoryayut i 1 i 2 usloviyu
//        info.testStudents(students, p1.or(p2));
        // method negate - vivedet vse elementi kotorie ne podhodyat pod 1 uslovie
        info.testStudents(students, p1.negate());

//        // bolee korodkiy vid
//        info.testStudents(students, s -> s.age>30);
//        // sleva korotkiy - sprava standart (rabotaet tolko s 1 parametrom v metode)
//        info.testStudents(students, s -> {return s.age>30;});
//        // sleva standart - sprava korotkiy (rabotaet tolko s 1 uspoviem v lyambda)
//        info.testStudents(students, (Student s) -> s.age>30);
//        System.out.println("--------------------------");
//        info.testStudents(students, (Student s) -> {return s.avgGrade>8;});
//        System.out.println("--------------------------");
//        info.testStudents(students, (Student s) -> {return s.age > 20 && s.avgGrade>8 && s.sex == 'f';});
//        StudentChecks sc = (Student p) -> {return  p.avgGrade > 8;};
//        info.testStudents(students, sc);
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
////        });
    }
}