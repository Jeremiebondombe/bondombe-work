// Import necessary packages
import java.util.Scanner;

// Define a public class named Lecturer
public class Lecturer {

    // Instance variables (shared by all methods)
    private String name;
    private int age;
    private String subject;
    private int experienceYears;

    // Public constructor to initialize instance variables
    public Lecturer(String name, int age, String subject, int experienceYears) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    // Public method to display lecturer information
    public void displayLecturerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Experience Years: " + experienceYears);
    }

    // Public method to calculate lecturer salary
    public int calculateLecturerSalary(int baseSalary) {
        // Calculate salary based on experience
        int salary = baseSalary + (experienceYears * 1000);
        return salary;
    }

    // Public method to increment experience years
    public void incrementExperience() {
        experienceYears++;
    }

    // Public getter and setter methods for instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    return salary;
}

// Public method to increment experience years
public void incrementExperience() {
    experienceYears++;
}

// Public getter and setter methods for instance variables
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getSubject() {
    return subject;
}

public void setSubject(String subject) {
    this.subject = subject;
}
System.out.println("Lecturer Salary: " + lecturer.calculateLecturerSalary(50000));
        lecturer.incrementExperience();
        System.out.println("Updated Experience Years: " + lecturer.getExperienceYears());

        // Get lecturer details from user
        lecturer.getLecturerDetailsFromUser();
        lecturer.displayLecturerInfo();
    }
}
