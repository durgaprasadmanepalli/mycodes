import java.util.Scanner;

public class user {
    String name;
    private int id;
    String companyname;
    String place;
    protected int age;
    private String position;

    public user(String name, int id, String companyname, String place, int age, String position) {
        this.name = name;
        this.id = id;
        this.companyname = companyname;
        this.place = place;
        this.age = age;
        this.position = position;
    }

    public void createUser(user obj1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne name: ");
        obj1.name = sc.next();
        System.out.println("Enter tne id: ");
        obj1.id = sc.nextInt();
        System.out.println("Enter tne companyname: ");
        obj1.companyname = sc.next();
        System.out.println("Enter tne place: ");
        obj1.place = sc.next();
        System.out.println("Enter tne age: ");
        obj1.age = sc.nextInt();
        System.out.println("Enter tne position: ");
        obj1.position = sc.next();

    }

    public void displayUser() {
        System.out.println("Enter tne name: " + this.name);
        System.out.println("Enter tne id: " + this.id);
        System.out.println("Enter tne companyname: " + this.companyname);
        System.out.println("Enter tne place: " + this.place);
        System.out.println("Enter tne age: " + this.age);
        System.out.println("Enter tne position: " + this.position);

    }

    public static void main(String[] args) {
        String name;
        int id;
        String companyname;
        String place;
        int age;
        String position;
        user obj1 = new user(name = "prasad", id = 10, companyname = "Axis", place = "mumbai", age = 20,
                position = "vhjcv");
        obj1.createUser(obj1);
        obj1.displayUser();

    }

}
