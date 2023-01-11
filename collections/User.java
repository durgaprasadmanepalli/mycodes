package Collection;
import java.util.*;
public class User extends branches{
    String username;
    long loan;
    User userarr[];
    int count = 0;
    Scanner sc = new Scanner(System.in);
    
    
    void addUser(){
        System.out.println("Enter username: ");
        username = sc.next();
        System.out.println("Enter loan amount: ");
        loan = sc.nextLong();
        if(super.checkLoan(loan)){
            if(count<userarr.length){
                User obj = new User();
                obj.username = username;
                obj.loan = loan;
                userarr[count] = obj;
                count++;
            }
            else{
                System.out.println("User cant be added");
                System.out.println("User cant be added!");
            }
        }
    }
}