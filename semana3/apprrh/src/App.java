import java.util.Scanner;

public class App {
    public String name[];
    private double salary;
    protected String role;

    void employeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Role: " + role);
    }

public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    App empleado = new App();

    System.out.print("Enter employee name: ");
    empleado.name = scanner.nextLine();
    System.out.print("Enter employee salary: ");
    empleado.salary = scanner.nextDouble();
    scanner.nextLine(); // Consume newline
    System.out.print("Enter employee role: ");
    empleado.role = scanner.nextLine();

    empleado.employeeDetails();
    scanner.close();


}
}