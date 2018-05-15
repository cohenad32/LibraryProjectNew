package sample;
//changed constructor
public class FriendOfTheLibrary extends Customer{

    int numRenews;

//how to only be FriendOfTheLibrary if made a donation
    public FriendOfTheLibrary(){
        super();
        this.numRenews = 3;
    }

    @Override
    public int getNumRenews() {
        return numRenews;
    }

    public static class Builder {
        Customer c = new FriendOfTheLibrary();

        public Builder email(String email) {
            c.email = email;
            return this;
        }

        public Builder firstName(String fName) {
            c.firstName = fName;
            return this;
        }

        public Builder lastName(String lName) {
            c.lastName = lName;
            return this;
        }

        public Builder firstName() {
            c.firstName = SqlStatement.sqlQueryString("select First_name from Library_Members where Email = '" + c.email + "'", "First_name");
            return this;
        }

        public Builder lastName() {
            c.lastName = SqlStatement.sqlQueryString("select Last_name from Library_Members where Email = '" + c.email + "'", "Last_name");
            return this;
        }


        public FriendOfTheLibrary build() {
            return (FriendOfTheLibrary) c;
        }
    }
}
