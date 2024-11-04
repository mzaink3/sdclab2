package labask3;

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private int phoneNo;
    private int age;

    public void addDetails() {
        System.out.println("Customer details added.");
    }

    public void modifyDetails() {
        System.out.println("Customer details modified.");
    }

    public void searchTicket() {
        System.out.println("Customer is searching for a ticket.");
    }

    public void makePayment() {
        System.out.println("Customer has made a payment.");
    }
}
