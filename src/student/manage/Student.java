package student.manage;

import java.util.Scanner;

public class Student {
    private String fname;
    private String lname;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 101;
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.fname = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lname = in.nextLine();
        System.out.println("1 - Firstname\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(fname + " " + lname + " " + gradeYear);
    }

}
