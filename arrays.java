import java.util.*;

public class arrays {

    String name;
    int age;
    String place;
    String college;
    int count = 0;
    arrays stdArray[];

    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Add Student details: ");
        if (count < stdArray.length) {
            arrays obj1 = new arrays();
            System.out.println("Enter student name: ");
            obj1.name = sc.next();
            System.out.println("Enter student age: ");
            obj1.age = sc.nextInt();
            System.out.println("Enter student place: ");
            obj1.place = sc.next();
            System.out.println("Enter student college: ");
            obj1.college = sc.next();
            stdArray[count] = obj1;
            count++;
        } else {
            System.out.println("Student cant be added, Array size is full");
        }
    }

    public void displayStudent() {
        System.out.println("Student details are: ");
        for (arrays std : stdArray) {
            if (std != null) {
                System.out.println("Student name: " + std.name);
                System.out.println("Student age: " + std.age);
                System.out.println("Student place: " + std.place);
                System.out.println("Student college: " + std.college);
            }
        }

    }

    public static void main(String args[]) {
        arrays obj = new arrays();
        System.out.println("Enter size of array");
        int n = obj.sc.nextInt();
        obj.stdArray = new arrays[n];

        System.out.println("---Student Details---");
        while (true) {

            System.out.println("Select choice:\n 1. Add Student Details\n 2. View Student Details\n 3.Exit");

            int choice = obj.sc.nextInt();

            switch (choice) {
                case 1:
                    obj.addStudent();
                    break;
                case 2:
                    obj.displayStudent();
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(1);
                default:
                    System.out.println("Please enter correct choice");

            }
        }

    }
}