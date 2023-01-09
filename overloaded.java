import java.util.Scanner;

public class overloaded {

    public static String patientname;
    private static int age;
    protected static String disease;
    private static int bill;
    private static String medical;

    public overloaded(String patientname, int age, String medical) {
        this.patientname = patientname;
        this.age = age;
        this.medical = medical;
    }

    public overloaded(int bill, String disease) {
        this.bill = bill;
        this.disease = disease;

    }

    public static void enteredhospital() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String patientname = sc.next();
        System.out.println("Enter a age: ");
        int age = sc.nextInt();
        System.out.println("Enter a disease: ");
        String disease = sc.next();
        System.out.println("Enter a bill: ");
        int bill = sc.nextInt();
        System.out.println("Enter a medical: ");
        String medical = sc.next();
        sc.close();
    }

    public void display() {
        System.out.println("Enter a name: " + this.patientname);
        System.out.println("Enter a age: " + this.age);
        System.out.println("Enter a disease: " + this.disease);
        System.out.println("Enter a bill: " + this.bill);
        System.out.println("Enter a medical: " + this.medical);
    }

    public static void main(String ags[]) {
        overloaded h1 = new overloaded(patientname = "prasad", age = 18, medical = "dolo");
        overloaded h2 = new overloaded(bill = 1000, disease = "nrmlfever");
        h1.enteredhospital();
        h2.display();
    }

}
