import java.util.Scanner;

public class prasadaxis1 {
    String name;
    String id;
    String company;
    String place;
    protected int age;
    private String pos;
    public String position;

    public void createUser(prasadaxis1 obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        obj.name = sc.next();
        System.out.println("Enter id :");
        obj.id = sc.next();
        System.out.println("Enter company :");
        obj.company = sc.next();
        System.out.println("Enter age: ");
        obj.age = sc.nextInt();
        System.out.println("Enter pos: ");
        obj.pos = sc.next();

    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("User id: " + id);
        System.out.println("Company: " + company);
        System.out.println("Age: " + age);
        System.out.println("Pos: " + pos);
    }

    public static void main(String[] args) {
        prasadaxis1 obj = new prasadaxis1();
        obj.createUser(obj);
        obj.display();
        abc

    }

}
