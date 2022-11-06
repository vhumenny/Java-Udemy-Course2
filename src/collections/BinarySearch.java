package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(-3);
//        arrayList.add(8);
//        arrayList.add(12);
//        arrayList.add(-8);
//        arrayList.add(0);
//        arrayList.add(5);
//        arrayList.add(10);
//        arrayList.add(1);
//        arrayList.add(150);
//        arrayList.add(-30);
//        arrayList.add(19);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1);

        Employee emp1 = new Employee(100,"Vova", 12345);
        Employee emp2 = new Employee(15,"Anna", 6542);
        Employee emp3 = new Employee(123,"Artem", 8542);
        Employee emp4 = new Employee(15,"Artur", 5678);
        Employee emp5 = new Employee(182,"Vasya", 125);
        Employee emp6 = new Employee(15,"Alla", 9874);
        Employee emp7 = new Employee(250,"Boris", 1579);
        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
    }
}

class Employee implements Comparable {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
