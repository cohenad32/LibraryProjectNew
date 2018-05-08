package sample;
//changed constructor
public class FriendOfTheLibrary extends Customer{

    int numRenews;

//how to only be FriendOfTheLibrary if made a donation
    public FriendOfTheLibrary(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        this.numRenews = 3;
    }

    @Override
    public int getNumRenews() {
        return numRenews;
    }
    //how to loop through each time renew item that it subtracts 1 from numRenews- need function
}
