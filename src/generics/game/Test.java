package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Petr", 12);

        Student student1 = new Student("Nick", 20);
        Student student2 = new Student("Alex", 18);

        Employee employee1 = new Employee("Anna", 33);
        Employee employee2 = new Employee("Artem", 29);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        Team<Student> studentTeam = new Team<>("Go");
        Team<Employee> employeeTeam = new Team<>("Workers");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Wise-men");
        Schoolar schoolar3 = new Schoolar("Alex", 15);
        Schoolar schoolar4 = new Schoolar("Mariya", 14);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
