// Define a public class named Teacher
public class Teacher {

    // Method to display teacher information
    public void displayTeacherInfo() {
        // Local variables
        String name = "John Doe";
        int age = 35;
        String subject = "Mathematics";

        // Display teacher information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }

    // Method to calculate teacher salary
    public void calculateTeacherSalary() {
        // Local variables
        double baseSalary = 50000;
        double bonus = 1000;
        double salary = baseSalary + bonus;

        // Display teacher salary
        System.out.println("Teacher Salary: " + salary);
    }

    // Method to display teacher address
    public void displayTeacherAddress() {
        // Local variables
        String street = "123 Main St";
        String city = "New York";
        String state = "NY";
        int zip = 10001;

        // Display teacher address
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
    }

    // Method to get teacher details from user
    public void getTeacherDetails() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Local variables
        String teacherName;
        int teacherAge;
        String teacherSubject;

        // Prompt user for input
        System.out.print("Enter teacher name: ");
        teacherName = scanner.nextLine();
        System.out.print("Enter teacher age: ");
        teacherAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter teacher subject: ");
        teacherSubject = scanner.nextLine();

        // Display teacher details
        System.out.println("Name: " + teacherName);
        System.out.println("Age: " + teacherAge);
        System.out.println("Subject: " + teacherSubject);
    }

    // Public static main method
    public static void main(String[] args) {
        // Create an instance of Teacher
        Teacher teacher = new Teacher();

        // Call methods
        teacher.displayTeacherInfo();
        teacher.calculateTeacherSalary();
        teacher.displayTeacherAddress();
        teacher.getTeacherDetails();
    }
}
