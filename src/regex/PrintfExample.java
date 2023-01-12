package regex;

public class PrintfExample {

    static void employeeInfo(Employee employee) {
        System.out.printf("", employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));
    }


    public static void main(String[] args) {

        System.out.printf("string needs to be left aligned," +
                " and second - double, should be rounded to tenth", "hi", "3.1415");
    }
}


class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
