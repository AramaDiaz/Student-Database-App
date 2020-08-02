package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    static Scanner s = new Scanner(System.in);
    private final String studentName;
    private String ID;
    private static int id = 1000;
    private String yearOfStudy;
    private int coursesAttended;
    private String courses = "";
    private static final int courseCost = 600;
    private int tuitionBalance;
    private int tuition;

    public Student () {
        this.studentName = askName();
        this.ID = generateID();
        enroll();
    }

    private String askName () {
        System.out.print("Enter student's first name: ");
        String fName = s.next();
        s.nextLine();
        System.out.print("Enter student's last name: ");
        String lName = s.nextLine();
        return fName + " " + lName;
    }

    private String generateID() {
        System.out.println("Enter student's class year:\n\t1 - Freshman" +
                "\n\t2 - Sophomore" + "\n\t3 - Junior \n\t4 - Senior" );
        int grade = s.nextInt();
        switch (grade) {
            case 1:
                int gradeLevel = 1;
                yearOfStudy = "Freshman";
                ID = Integer.toString(gradeLevel) + id;
                break;
            case 2: gradeLevel = 2;
                yearOfStudy = "Sophomore";
                ID = Integer.toString(gradeLevel) + id;
                break;
            case 3: gradeLevel = 3;
                yearOfStudy = "Junior";
                ID = Integer.toString(gradeLevel) + id;
                break;
            case 4: gradeLevel = 4;
                yearOfStudy = "Senior";
                ID = Integer.toString(gradeLevel) + id;
                break;
        }
        id++;
        return ID;
    }

    public void enroll() {
        boolean flag = false;
        System.out.println("Enter course to enroll: \n1. History 101\n2. Mathematics 101\n3. English 101" +
                "\n4. Chemistry 101\n5. Computer Science 101\n0. exit");
        while (!flag) {
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    coursesAttended++;
                    tuition +=courseCost;
                    courses += "\n\tHistory 101 ";
                    break;
                case 2:
                    coursesAttended++;
                    tuition +=courseCost;
                    courses += "\n\tMathematics 101 ";
                    break;
                case 3:
                    coursesAttended++;
                    tuition +=courseCost;
                    courses += "\n\tEnglish 101 ";
                    break;
                case 4:
                    coursesAttended++;
                    tuition +=courseCost;
                    courses += "\n\tChemistry 101 ";
                    break;
                case 5:
                    coursesAttended++;
                    tuition +=courseCost;
                    courses += "\n\tComputer Science 101 ";
                    break;
                case 0:
                    flag = true;
                    break;
            }
        }
        tuitionBalance = coursesAttended*courseCost;
        System.out.println("Total tuition: " + tuition);
    }

    public void viewBalance() {
        System.out.println("Student's balance is: $" + tuitionBalance);
    }

    public void payTuition () {
        System.out.print("Student's tuition balance is $" + tuitionBalance + ". Enter payment: $");
        int payment = s.nextInt();
        System.out.println("Student payed $" + payment);
        tuitionBalance -= payment;
        viewBalance();
    }

    public String toString() {
        return "\nName: " + studentName + "\nID: " + ID + " - " + this.yearOfStudy + "\nCourses enrolled: " +
                courses + "\nTotal tuition: " + tuition + "\nTuition balance: $" + tuitionBalance;
    }
}
