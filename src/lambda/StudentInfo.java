package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student s : students) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Artem", 'm', 22, 3, 8.3);
        Student st2 = new Student("Anna", 'f', 23, 4, 9.3);
        Student st3 = new Student("Vladimir", 'm', 25, 5, 5.3);
        Student st4 = new Student("Irina", 'f', 20, 1, 7.8);
        Student st5 = new Student("Vasiliy", 'm', 22, 3, 8.3);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);


        StudentInfo studentInfo = new StudentInfo();


        studentInfo.testStudents(arrayList, (Student s) -> {
            return s.avgGrade > 8;
        });
        studentInfo.testStudents(arrayList, s -> s.avgGrade > 8);
        studentInfo.testStudents(arrayList, (Student s) -> s.avgGrade > 8);
        studentInfo.testStudents(arrayList, s -> {
            System.out.println("hello");
            return s.avgGrade > 8;
        });

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        studentInfo.testStudents(arrayList, p1.and(p2));
        studentInfo.testStudents(arrayList, p1.or(p2));
        studentInfo.testStudents(arrayList, p1.negate());
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}