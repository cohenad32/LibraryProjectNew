package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class createCustomerController {
    public TextField custFirstName;
    public TextField custLastName;
    public TextField custEmail;
    public CheckBox friendOfLibrary;
    public Button submitCust;

    View view = new View();

    public void submitCust(ActionEvent actionEvent) {
        Customer c = view.generateCustomer();
        c.addMember();

    }


    class View {
        public Customer generateCustomer() {
            String firstName = custFirstName.getText();
            String lastName = custLastName.getText();
            String email = custEmail.getText();
            if (friendOfLibrary.isSelected()) {
                Customer c = new FriendOfTheLibrary(firstName, lastName, email);
                return c;
            }
            // customer is a regular customer
            else {
                Customer c = new RegularCustomer(firstName, lastName, email);
                return c;
            }  return null;

        }
    }

}

