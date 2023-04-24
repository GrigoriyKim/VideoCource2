package lyambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

//    void printStudentOverGrade(ArrayList<Student> al, double grade){
//        for (Student s : al){
//            if (s.avgGrade > grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> al, int age){
//        for (Student s : al){
//            if (s.age < age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex){
//        for (Student s : al){
//            if (s.age > age && s.avgGrade < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> al, StudentChecks sc){
        for (Student s : al) {
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }
}

class Test{
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
//          // klassicheskiy vid
//        StudentInfo info = new StudentInfo();
//        info.printStudentOverGrade(students, 8);
//        System.out.println("--------------------------");
//        info.printStudentUnderAge(students, 30);
//        System.out.println("--------------------------");
//        info.printStudentMixCondition(students, 20, 9.5, 'f');
        // anonimniy klass
        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("--------------------------");
//        // lyambda virajenie
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age<30;
//            }
//        });
//        System.out.println("--------------------------");
//        // klasicheskiy vid
//        info.testStudents(students, (Student s) -> {return s.age>30;});
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
//        });
        Collections.sort(students, (s1, s2) -> s1.course - s2.course);
        System.out.println(students);
    }
}

interface StudentChecks{
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}