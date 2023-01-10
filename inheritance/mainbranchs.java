package inheritance;

import java.util.*;

public class mainbranchs {
    String name;
    int bankid;
    long phnno;
    double banktotalfund;
    float bankintrest;

    public mainbranchs(double banktotalfund, float bankintrest) {
        this.banktotalfund = banktotalfund;
        this.bankintrest = bankintrest;
    }

    public boolean checkloan(long loan) {
        boolean flag = false;
        if (loan < banktotalfund) {
            System.out.println("Loan is approved");
            flag = true;
        }

        else {
            System.out.println("Loan is not approved");
        }
        return flag;
    }

    public void totalintrest(float branchintrest) {
        System.out.println("Total intrest: " + (bankintrest + branchintrest));

    }
}
