package sample;

public class RegularCustomer extends Customer {

    int numRenews = 1;

    public RegularCustomer(){
        super();
    }

    @Override
    public int getNumRenews() {
        return numRenews;
    }

    public static class Builder {
        Customer c = new RegularCustomer();

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


        public RegularCustomer build() {
            return (RegularCustomer) c;
        }
    }
}
