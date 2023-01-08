import java.util.Scanner;

public class constructor1 {
    public String name;
    private int userid;
    public String companyname;
    public String place;
    protected int age;
    private String position;

    public constructor1(String name, int userid, String companyname, String place, int age, String position) {
        this.name = name;
        this.userid = userid;
        this.companyname = companyname;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    public void createuser(constructor1 obj2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        obj2.name = sc.next();
        System.out.println("Enter your userid: ");
        obj2.userid = sc.nextInt();
        System.out.println("Enter your companyname: ");
        obj2.companyname = sc.next();
        System.out.println("Enter your place: ");
        obj2.place = sc.next();
        System.out.println("Enter your age: ");
        obj2.age = sc.nextInt();
        System.out.println("Enter your position: ");
        obj2.position = sc.next();
        sc.close();
    }

    public void display() {
        System.out.println("Enter your name: " + this.name);
        System.out.println("Enter your id: " + this.userid);
        System.out.println("Enter your companyname: " + this.companyname);
        System.out.println("Enter your place: " + this.place);
        System.out.println("Enter your age: " + this.age);
        System.out.println("Enter your position: " + this.position);
    }

    public static void main(String args[]) {
        String name;
        int userid;
        String companyname;
        String place;
        int age;
        String position;

        constructor1 obj2 = new constructor1(name = "prasad", userid = 234, companyname = "axis", place = "bangalore",
                age = 23, position = "It");
        obj2.createuser(obj2);
        obj2.display();

    }

}
