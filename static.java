// Import necessary packages
import java.util.Scanner;

// Define a public class named Lecturer
public class Lecturer {

    // Static variables (shared by all instances)
    public static int lecturerCount = 0;
    public static String department = "Computer Science";
    public static double salaryScale = 1.0;

    // Instance variables
    private String name;
    private int age;
    private String subject;

    // Public constructor to initialize instance variables
    public Lecturer(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        lecturerCount++; // Increment static variable
    }

    // Public static method to display department
    public static void displayDepartment() {
        System.out.println("Department: " + department);
    }

    // Public static method to calculate salary
    public static double calculateSalary(double baseSalary) {
        return baseSalary * salaryScale;
    }

    // Public static method to get lecturer count
    public static int getLecturerCount() {
        return lecturerCount;
    }

    // Public method to display lecturer information
    public void displayLecturerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }

    // Public method to get lecturer details from user
    public void getLecturerDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter lecturer name: ");
        name = scanner.nextLine();
        System.out.print("Enter lecturer age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter lecturer subject: ");
        subject = scanner.nextLine();
    }

    // Public static main method
    public static void main(String[] args) {
        // Create instances of Lecturer
        Lecturer lecturer1 = new Lecturer("John Doe", 35, "Mathematics");
        Lecturer lecturer2 = new Lecturer("Jane Doe", 40, "Science");

        // Call static methods
        displayDepartment();
        System.out.println("Lecturer Count: " + getLecturerCount());
        System.out.println("Salary: " + calculateSalary(50000));

        // Call instance methods
        lecturer1.displayLecturerInfo();
        lecturer2.displayLecturerInfo();

        // Get lecturer details from user
        lecturer1.getLecturerDetailsFromUser();
        lecturer1.displayLecturerInfo();
    }
}
