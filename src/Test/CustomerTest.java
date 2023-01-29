package Test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer firstCustomer = new Customer();

        firstCustomer.setID(2);
        firstCustomer.setIsNew(true);
        firstCustomer.setTotal(2400.0F);

        firstCustomer.displayCustomerInfo();

    }

}
