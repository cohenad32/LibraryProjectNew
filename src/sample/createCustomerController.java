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
    public CheckBox regularCustomer;
    public CheckBox friendOfLibrary;
    public Button submitCust;

    Controller controller = new Controller();



    class View {
        public void submitCust(ActionEvent actionEvent) {
            String firstName = custFirstName.getText();
            String lastName = custLastName.getText();
            String email = custEmail.getText();
            if (regularCustomer.isSelected()){
                Customer c = new RegularCustomer(firstName, lastName, email);
                //controller.uploadCustomer(c);

            }
            else if (friendOfLibrary.isSelected()){
                Customer c = new FriendOfTheLibrary(firstName, lastName, email);
                //controller.uploadCustomer(c);
            }

        }
    }

    class Controller {
        View view = new View();

        void uploadCustomer(Customer customer) {
            customer.addMember();
        }

    }
}

