package JavaProject;

import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            // Display menu with options
        	System.out.println("");
            System.out.println("1 INSERT");
            System.out.println("2 DISPLAY");
            System.out.println("3 SEARCH");
            System.out.println("4 DELETE");
            System.out.println("5 UPDATE");
            System.out.println("6 COUNT STUDENTS");
            System.out.println("0 EXIT");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    // Insert a new student
                    System.out.print("Enter student roll no: ");
                    int rollno = s.nextInt();
                    System.out.print("Enter student name: ");
                    String name = s1.nextLine();
                    System.out.print("Enter student marks: ");
                    double marks = s.nextDouble();
                    System.out.print("Enter student degree: ");
                    String degree = s1.nextLine();  // To handle degree input
                    studentList.add(new Student(rollno, name, marks, degree));
                    System.out.println("-----------------------");
                    System.out.println("Student Inserted successfully");
                    System.out.println("-----------------------");
                    break;

                case 2:
                    // Display all students
                    System.out.println("-----------------------");
                    Iterator<Student> i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        System.out.println(student);
                    }
                    System.out.println("-----------------------");
                    break;

                case 3:
                    // Search for a student by roll number
                    boolean found = false;
                    System.out.print("Enter student roll no: ");
                    rollno = s.nextInt();
                    i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        if (student.getRollno() == rollno) {
                            found = true;
                            System.out.println("-----------------------");
                            System.out.println(student);
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    }
                    System.out.println("-----------------------");
                    break;

                case 4:
                    // Delete a student by roll number
                    found = false;
                    System.out.print("Enter student roll no to delete: ");
                    rollno = s.nextInt();
                    i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        if (student.getRollno() == rollno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    } else {
                        System.out.println("-----------------------");
                        System.out.println("Student Deleted successfully");
                    }
                    System.out.println("-----------------------");
                    break;

                case 5:
                    // Update a student's details
                    found = false;
                    System.out.print("Enter student roll no to update: ");
                    rollno = s.nextInt();
                    ListIterator<Student> li = studentList.listIterator();
                    while (li.hasNext()) {
                        Student student = li.next();
                        if (student.getRollno() == rollno) {
                            System.out.print("Enter student name: ");
                            name = s1.nextLine();
                            System.out.print("Enter student marks: ");
                            marks = s.nextDouble();
                            System.out.print("Enter student degree: ");
                            degree = s1.nextLine();  // Update degree
                            li.set(new Student(rollno, name, marks, degree));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    } else {
                        System.out.println("Student Updated successfully");
                    }
                    System.out.println("-----------------------");
                    break;

                case 6:
                    // Count the number of students
                    System.out.println("-----------------------");
                    System.out.println("Total number of students: " + studentList.size());
                    System.out.println("-----------------------");
                    break;

                case 0:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (ch != 0);  // Continue until the user chooses 0 to exit
    }
}
    