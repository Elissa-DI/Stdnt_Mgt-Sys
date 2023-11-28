package student.manage;

import java.util.Scanner;

public class Student {
    private String fname;
    private String lname;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.fname = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lname = in.nextLine();
        System.out.println("1 - Firstname\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(fname + " " + lname + " " + gradeYear + " " + studentId);
    }

    private void setStudentID() {
        //Grade level + ID
        id ++;
        this.studentId = gradeYear + "" + id;
    }
    //Enrolling in courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while ( 1 != 0);

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

}
