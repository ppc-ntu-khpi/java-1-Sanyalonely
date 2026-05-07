package domain;

public class Customer {
    private int id = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Is the customer new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}