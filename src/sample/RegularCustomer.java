package sample;

public class RegularCustomer extends Customer {

    int numRenews = 1;

    public RegularCustomer(String firstName, String lastName, String email){
        super(firstName, lastName, email);
    }

    @Override
    public int getNumRenews() {
        return numRenews;
    }
}
