import java.util.Scanner;

class hospital {
    public String name;
    public int rno;
    private int bill;
    protected String medicines;

    public void EnteredHospital(hospital obj) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        obj.name = sc.next();
        System.out.println("Enter your rno: ");
        obj.rno = sc.nextInt();
        System.out.println("Enter your bill: ");
        obj.bill = sc.nextInt();
        System.out.println("Enter your medicines: ");
        obj.medicines = sc.next();
        System.out.println("User created successfully ");
        sc.close();

    }

    public void display(hospital obj) {
        System.out.println(obj.name);
        System.out.println(obj.rno);
        System.out.println(obj.bill);
        System.out.println(obj.medicines);

    }

    public static void main(String args[]) {
        hospital obj = new hospital();
        obj.EnteredHospital(obj);
        obj.display(obj);

    }
}
