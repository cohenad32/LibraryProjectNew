package sample;
//changed constructor
public class FriendOfTheLibrary extends Customer{

    //how to only be FriendOfTheLibrary if made a donation
    public FriendOfTheLibrary(String firstName, String lastName, String email){
        super(firstName, lastName, email);
        int numRenews = 3;
    }

//how to loop through each time renew item that it subtracts 1 from numRenews- need function
}
