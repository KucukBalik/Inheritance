package ie.atu.inheritance;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        PrefferedCustomer prefferedCustomer1 = new PrefferedCustomer();
        prefferedCustomer1.setName("Emre");
        prefferedCustomer1.setAddress("Galway");
        prefferedCustomer1.setNumber("123");
        prefferedCustomer1.setMailingList(false);

        System.out.println(prefferedCustomer1.toString());
        System.out.println(prefferedCustomer1.getLoyaltyPoints());

        prefferedCustomer1.addLoyaltyPoints(800);


        System.out.println(prefferedCustomer1.toString());
        System.out.println(prefferedCustomer1.getLoyaltyPoints());

        prefferedCustomer1.discountPercentage();
    }
}