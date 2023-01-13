package regex;

public class PrintfExample {

    static void employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Volodymyr", "Gumenniy", 12345, 0.15);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 6542, 0.08);
        Employee employee3 = new Employee(123, "Mariya", "Ivanova", 8542, 0.12);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String string = String.format("%03d \t %-12s \t %-12s \t %,.1f \n", 1, "Volodymyr", "Gumenniy", 12345*(1+0.15));
        System.out.println(string);
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
