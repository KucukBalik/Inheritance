package ie.atu.inheritance;

public class Customer extends Person {

    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String number, boolean mailingList) {
        super(name, address, number);
        this.mailingList = mailingList;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {

        return  super.toString() + "Customer{" +
                "mailingList=" + mailingList +
                '}';
    }
}
