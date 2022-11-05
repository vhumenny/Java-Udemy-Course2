package collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student student1 = new Student("Vova", 'm', 34, 2, 9.8);
        Student student2 = new Student("Anna", 'f', 37, 3, 8.8);
        Student student3 = new Student("Artem", 'm', 18, 1, 10);
        Student student4 = new Student("Artur", 'm', 24, 2, 10.8);
        Student student5 = new Student("Mariya", 'f', 22, 5, 6.8);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);
        Student student6 = new Student("Mariya", 'f', 22, 5, 6.8);
//        studentList.remove(student6);
        int index = studentList.indexOf(student6);
        System.out.println(index);
    }

}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade,
                avgGrade) == 0 && Objects.equals(name, student.name);
    }
}
