package STEP.week1;

import java.util.Scanner;

class customer {
    String customerId;
    String customerType;
    public void identifyCustomer(String customerId) {
        if (customerId.startsWith("VIP")) {
            customerType = "VIP Customer";
        } else if (customerId.startsWith("CUS")) {
            customerType = "Regular Customer";
        } else {
            customerType = "Unknown Customer Type";
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + this.customerId+"\tCustomer Type: " + this.customerType);
    }
}

public class customerIdentificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        customer[]  items = new customer[n]; //no object is actually created here, just n references
        for (int i = 0; i < n; i++) {
            items[i] = new customer(); //object is created for each customer
            System.out.print("Enter your Customer ID: ");
            items[i].customerId = sc.nextLine();
            items[i].identifyCustomer(items[i].customerId);
        }

        for (int i = 0; i < n; i++) {
            items[i].displayCustomerInfo();
        }
        sc.close();
    }
    
}
