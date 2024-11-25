package ie.atu.inheritance;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Customer part1Customer = new Customer("Emre", "Galway", "123", false);

        System.out.printf(part1Customer.toString());

        Customer part2Customer = new Customer();

        part2Customer.setName("Emre2");
        part2Customer.setAddress("Cork");
        part2Customer.setNumber("456");
        part2Customer.setMailingList(false);

        System.out.println(part2Customer.toString());

        }
    }