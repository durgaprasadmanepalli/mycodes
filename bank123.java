public class bank123 {

    public static int currentBalance = 1000;

    public static void greetCustomer() {
        System.out.println("Hi,welcoming to banking");

    }

    public static void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Amount is deposit successfully");

    }

    public static void withdraw(int amount) {
        currentBalance = currentBalance - amount;
        System.out.println("Amount is withdraw successfully");

    }

    public int getcurrentBalance() {
        return currentBalance;
    }

    public static void main(String args[]) {
        bank123 m = new bank123();
        greetCustomer();
        System.out.println("current balance is: " + m.getcurrentBalance());
        m.deposit(500);
        System.out.println("current balance is: " + m.getcurrentBalance());
        bank123.withdraw(300);
        System.out.println("current balance is: " + m.getcurrentBalance());
        System.out.println("----------Thank You visit again----------");

    }
}
