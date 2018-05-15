package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
<<<<<<< HEAD
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

=======
/*
>>>>>>> 93e7eb2253833c61e73fe79c2eb7a180d35adc4c
public class updateCustomerController {
    public TextField custEmail;
    public Button lookUpCust;
    public TextField newCustFirstName;
    public TextField newCustLastName;
    public CheckBox friendOfTheLibrary;
    public TextField newCustEmail;
    public Button submitUpdates;

<<<<<<< HEAD
    View view = new View;
=======
    Controller controller = new Controller();
>>>>>>> 93e7eb2253833c61e73fe79c2eb7a180d35adc4c

    public void updateCustomer(ActionEvent actionEvent){
        //figure out the best way to impliment this
        Customer c = view.generateCust();
        c.updateMember("string","string");

    }

    public void retrieveCust(ActionEvent actionEvent) {


    }


    class View {
        public Customer generateCust() {
            String firstName = newCustFirstName.getText();
            String lastName = newCustLastName.getText();
            String email = newCustEmail.getText();
            if (friendOfTheLibrary.isSelected()) {
                Customer c = new FriendOfTheLibrary(firstName, lastName, email);
                return c;
            }

            // customer is a regular customer
            else {
                Customer c = new RegularCustomer(firstName, lastName, email);
                return c;
            }

        }

        public String

        public void populateCustomer(){ }
    }


}
*/