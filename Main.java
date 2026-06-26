import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Add sample data
        addSampleData();
        
        System.out.println("==================================");
        System.out.println("   STUDENT MARKS MANAGEMENT");
        System.out.println("==================================");

        while (true) {
            System.out.println("\n1. Student Login");
            System.out.println("2. Student Sign Up");
            System.out.println("3. Teacher Login");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) studentLogin();
            else if (choice == 2) studentSignUp();
            else if (choice == 3) teacherLogin();
            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
            else System.out.println("Invalid choice!");
        }
    }

    static void addSampleData() {
        Student s1 = new Student(101, "Arun", 2023, "CS", "A", "pass123");
        Student s2 = new Student(102, "Priya", 2023, "CS", "A", "pass456");
        
        s1.addMarks("Math", 85);
        s1.addMarks("Physics", 78);
        s2.addMarks("Math", 92);
        s2.addMarks("Physics", 88);
        
        students.add(s1);
        students.add(s2);
        System.out.println("✓ Sample data loaded!");
    }

    static void studentLogin() {
        System.out.println("\n--- STUDENT LOGIN ---");
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Password: ");
        String pwd = sc.nextLine();

        for (Student s : students) {
            if (s.rollNo == roll && s.checkPassword(pwd)) {
                System.out.println("\nWelcome " + s.name + "!");
                studentMenu(s);
                return;
            }
        }
        System.out.println("✗ Invalid credentials!");
    }

    static void studentSignUp() {
        System.out.println("\n--- STUDENT SIGN UP ---");
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.println("✗ Roll number already exists!");
                return;
            }
        }
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Branch: ");
        String branch = sc.nextLine();
        System.out.print("Section: ");
        String section = sc.nextLine();
        System.out.print("Password: ");
        String pwd = sc.nextLine();
        password(pwd);
        

        students.add(new Student(roll, name, year, branch, section, pwd));
        System.out.println("✓ Student registered!");
    }
    static void password(String pwd){
        String p=sc.nextLine();
        if(!pwd.equals(p)){
            System.out.println("password mismatch");
            password(pwd);
        }
    }

    static void teacherLogin() {
        System.out.println("\n--- TEACHER LOGIN ---");
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pwd = sc.nextLine();

        if (user.equals("teacher") && pwd.equals("teacher123")) {
            System.out.println("\nWelcome Teacher!");
            teacherMenu();
        } else {
            System.out.println("✗ Invalid credentials!");
        }
    }

    static void studentMenu(Student s) {
        while (true) {
            System.out.println("\n--- STUDENT MENU ---");
            System.out.println("1. View Marks");
            System.out.println("2. View Profile");
            System.out.println("3. Logout");
            System.out.print("Choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) s.displayMarks();
            else if (choice == 2) s.displayProfile();
            else if (choice == 3) {
                System.out.println("Logging out...");
                break;
            }
            else System.out.println("Invalid choice!");
        }
    }

    static void teacherMenu() {
        while (true) {
            System.out.println("\n--- TEACHER MENU ---");
            System.out.println("1. View All Students");
            System.out.println("2. Add Marks");
            System.out.println("3. Update Marks");
            System.out.println("4. View Student Marks");
            System.out.println("5. Logout");
            System.out.print("Choose: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) viewAllStudents();
            else if (choice == 2) addMarks();
            else if (choice == 3) updateMarks();
            else if (choice == 4) viewStudentMarks();
            else if (choice == 5) {
                System.out.println("Logging out...");
                break;
            }
            else System.out.println("Invalid choice!");
        }
    }

    static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students!");
            return;
        }
        System.out.println("\n--- ALL STUDENTS ---");
        for (Student s : students) {
            s.displayProfile();
        }
    }

    static void addMarks() {
        System.out.println("\n--- ADD MARKS ---");
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        
        for (Student s : students) {
            if (s.rollNo == roll) {
                System.out.print("Subject: ");
                String subject = sc.nextLine();
                System.out.print("Mark (0-100): ");
                int mark = sc.nextInt();
                sc.nextLine();
                
                if (mark >= 0 && mark <= 100) {
                    s.addMarks(subject, mark);
                } else {
                    System.out.println("✗ Invalid mark!");
                }
                return;
            }
        }
        System.out.println("✗ Student not found!");
    }

    static void updateMarks() {
        System.out.println("\n--- UPDATE MARKS ---");
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        
        for (Student s : students) {
            if (s.rollNo == roll) {
                if (s.subjects.isEmpty()) {
                    System.out.println("No marks to update!");
                    return;
                }
                
                System.out.println("Current subjects: " + s.subjects);
                System.out.print("Subject to update: ");
                String subject = sc.nextLine();
                System.out.print("New mark (0-100): ");
                int newMark = sc.nextInt();
                sc.nextLine();
                
                if (newMark >= 0 && newMark <= 100) {
                    s.updateMarks(subject, newMark);
                } else {
                    System.out.println("✗ Invalid mark!");
                }
                return;
            }
        }
        System.out.println("✗ Student not found!");
    }

    static void viewStudentMarks() {
        System.out.println("\n--- VIEW STUDENT MARKS ---");
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        
        for (Student s : students) {
            if (s.rollNo == roll) {
                s.displayMarks();
                return;
            }
        }
        System.out.println("✗ Student not found!");
    }
}

