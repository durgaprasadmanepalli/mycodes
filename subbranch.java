package inheritance;

import java.util.Scanner;

public class subbranch extends mainbranchs {
    String branchname;
    int branchid;
    long branchphno;
    private long branchtotalfund;
    private static float branchintrest;

    public subbranch(long banktotalfund, float bankintrest, long branchtotalfund, float branchintrest) {
        super(banktotalfund, bankintrest);
        this.branchtotalfund = branchtotalfund;
        this.branchintrest = branchintrest;
    }

    public void loan(long loan) {
        super.checkloan(loan);
    }

    public static void main(String args[]) {
        System.out.println("Enter loan amount: ");
        Scanner sc = new Scanner(System.in);
        long loan = sc.nextLong();
        subbranch s1 = new subbranch(200000, (float) 1.5, 150000, 2);
        boolean res = s1.checkloan(100000);
        s1.totalintrest(branchintrest);

    }

}
