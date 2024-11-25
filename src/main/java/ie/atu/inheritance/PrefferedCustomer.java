package ie.atu.inheritance;

public class PrefferedCustomer extends Customer {

    private Integer loyaltyPoints;
    private Integer discountLevel;

    public PrefferedCustomer() {

    }

    public PrefferedCustomer(String name, String address, String number, boolean mailingList, Integer loyaltyPoints, Integer discountLevel) {
        super(name, address, number, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }
}
