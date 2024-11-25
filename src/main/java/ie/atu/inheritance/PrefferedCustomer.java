package ie.atu.inheritance;

import org.w3c.dom.ls.LSOutput;

public class PrefferedCustomer extends Customer {

    private Integer loyaltyPoints = 0;
    private Integer discountLevel;

    public PrefferedCustomer() {

    }

    public PrefferedCustomer(String name, String address, String number, boolean mailingList, Integer loyaltyPoints, Integer discountLevel) {
        super(name, address, number, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public String getLoyaltyPoints() {
        return "Loyalty Points = " + loyaltyPoints;
    }

    public Integer compareLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(Integer addedLoyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints + addedLoyaltyPoints;
    }

    public Integer getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(Integer discountLevel) {
        this.discountLevel = discountLevel;
    }

    public void discountPercentage()
    {
        if(loyaltyPoints == 0)
        {
            System.out.println("You have no discount. \n");
        } else if (loyaltyPoints >= 500) {
            System.out.println("You have %5 discount");

        } else if (loyaltyPoints >= 1000) {
            System.out.println("You have %6 discount");

        } else if (loyaltyPoints >= 1500) {
            System.out.println("You have %7 discount");

        } else if (loyaltyPoints >= 2000) {
            System.out.println("You have %10 discount");

        }
    }
}
