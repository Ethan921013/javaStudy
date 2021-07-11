package inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerName("Lee");
        customer.setCustomerID(10010);
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerName("Ethan");
        vipCustomer.setCustomerID(10020);
        vipCustomer.bonusPoint = 10000;
        System.out.println(vipCustomer.showCustomerInfo());

    }

}
