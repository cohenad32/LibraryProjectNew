package sample;

public class RegularCustomer extends Customer{


    public RegularCustomer(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        int numRenews = 1;
    }
//dont need all code becaese in abstract class
//loop to renew the item only once- make a function renewItem
}
