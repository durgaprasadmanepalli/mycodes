import java.util.Scanner;

public class consoverdemo {
    String restaurantName;
    String place;
    protected String typeofFood;
    private int items;

    public consoverdemo(String restaurantName, String place, String typeofFood) {
        this.restaurantName = restaurantName;
        this.place = place;
        this.typeofFood = typeofFood;
    }

    public consoverdemo(String restaurantName, String place, String typeofFood, int items) {
        this.restaurantName = restaurantName;
        this.place = place;
        this.typeofFood = typeofFood;
        this.items = items;
    }

    public void createCustomer(consoverdemo obj1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("restaurant name : ");
        sc.next();
        System.out.println("place of the restaurant : ");
        sc.next();
        System.out.println("type of food offered : ");
        sc.next();
        System.out.println("No of items : ");
        sc.nextInt();
    }

    public void displayUser() {
        System.out.println("restaurant name : " + this.restaurantName);
        System.out.println("place of the restaurant : " + this.place);
        System.out.println("type of food offered : " + this.typeofFood);
        System.out.println("No of items : " + this.items);
    }

    public static void main(String[] args) {
        String restaurantName;
        String place;
        String typeofFood;
        int items;
        consoverdemo obj1 = new consoverdemo(restaurantName = "Savera", place = "Rajahmundry", typeofFood = "Non-Veg");
        obj1.createCustomer(obj1);
        obj1.displayUser();
    }

}
