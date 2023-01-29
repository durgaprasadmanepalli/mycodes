package designpatterns;

public class bank {
    private static bank obj = new bank();

    private bank() {

    }

    public static bank getstatus(int time) {
        if (time > 9 && time < 18) {
            System.out.println("Bank is opened");
        } else {
            System.out.println("bank is closed");
        }
        return obj;

    }

}
