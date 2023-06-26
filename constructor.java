import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    // 4-argument constructor
    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }

    // 3-argument constructor for NIT students
    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    // Getters and Setters for all attributes
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Student's Name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter Student's address:");
        String studentAddress = scanner.nextLine();

        String nit;
        String collegeName = "";

        while (true) {
            System.out.println("Whether the student is from NIT(Yes/No):");
            nit = scanner.nextLine();

            if (nit.equalsIgnoreCase("Yes")) {
                collegeName = "NIT";
                break;
            } else if (nit.equalsIgnoreCase("No")) {
                System.out.println("Enter the college name:");
                collegeName = scanner.nextLine();
                break;
            } else {
                System.out.println("Wrong Input");
            }
        }

        if (collegeName.equals("NIT")) {
            Student student = new Student(studentId, studentName, studentAddress);
            System.out.println("Student id: " + student.getStudentId());
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Address: " + student.getStudentAddress());
            System.out.println("College name: " + student.getCollegeName());
        } else {
            Student student = new Student(studentId, studentName, studentAddress, collegeName);
            System.out.println("Student id: " + student.getStudentId());
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Address: " + student.getStudentAddress());
            System.out.println("College name: " + student.getCollegeName());
        }
    }
}
