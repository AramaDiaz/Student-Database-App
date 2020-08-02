package studentDatabaseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
//         Create how many new users will be added:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of new students to enroll: ");
        int noStudents = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>(noStudents);
//         Create the database with n number of students:
        for (int i = 0; i < noStudents; i++) {
            Student st = new Student();
            st.payTuition();
            students.add(st);
        }
        for (Student s : students) {
        System.out.println(s.toString());
        }
    }
}
