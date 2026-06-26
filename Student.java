import java.util.ArrayList;

class Student {
    int rollNo;
    String name;
    int year;
    String branch;
    String section;
    String password;
    ArrayList<String> subjects;
    ArrayList<Integer> marks;

    // Constructor
    Student(int rollNo, String name, int year, String branch, String section, String password) {
        this.rollNo = rollNo;
        this.name = name;
        this.year = year;
        this.branch = branch;
        this.section = section;
        this.password = password;
        this.subjects = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    // Add marks
    void addMarks(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);
        System.out.println("✓ Marks added successfully!");
    }

    // Update marks
    void updateMarks(String subject, int newMark) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).equalsIgnoreCase(subject)) {
                marks.set(i, newMark);
                System.out.println("✓ Marks updated successfully!");
                return;
            }
        }
        System.out.println("✗ Subject not found!");
    }

    // Display profile
    void displayProfile() {
        System.out.println("\n--- STUDENT PROFILE ---");
        System.out.println("Roll No  : " + rollNo);
        System.out.println("Name     : " + name);
        System.out.println("Year     : " + year);
        System.out.println("Branch   : " + branch);
        System.out.println("Section  : " + section);
        System.out.println("------------------------");
    }

    // Display marks
    void displayMarks() {
        if (subjects.isEmpty()) {
            System.out.println("No marks available!");
            return;
        }
        System.out.println("\n--- MARKS CARD ---");
        System.out.println("Subject\t\tMark\tGrade");
        System.out.println("------------------------");
        int total = 0;
        for (int i = 0; i < subjects.size(); i++) {
            String grade = getGrade(marks.get(i));
            System.out.println(subjects.get(i) + "\t\t" + marks.get(i) + "\t" + grade);
            total += marks.get(i);
        }
        System.out.println("------------------------");
        double percentage = (double) total / subjects.size();
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("------------------------");
    }

    // Calculate grade
    String getGrade(int mark) {
        if (mark >= 90) return "A+";
        else if (mark >= 80) return "A";
        else if (mark >= 70) return "B";
        else if (mark >= 60) return "C";
        else if (mark >= 50) return "D";
        else return "F";
    }

    // Check password
    boolean checkPassword(String pwd) {
        return this.password.equals(pwd);
    }
}