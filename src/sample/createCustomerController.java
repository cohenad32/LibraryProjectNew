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

    public String custType;


    public TextField getCustFirstName() {
        return custFirstName;
    }

    Controller controller = new Controller();

    public void submitCust(ActionEvent actionEvent) {
        String firstName = custFirstName.getText();
        String lastName = custLastName.getText();
        String email = custEmail.getText();
        if (regularCustomer.isSelected()){
            Customer c = new RegularCustomer(firstName, lastName, email);
        }
        else if (friendOfLibrary.isSelected()){
            Customer c = new FriendOfTheLibrary(firstName, lastName, email);
        }
    }

    class View {
        void drawScreen(Customer customer) {
            //txtName.setText(customer.getName());
            //txtEmail.setText(customer.getEmail());
        }
    }

    class Controller {
        View view = new View();

        void startWithSampleCustomer() {
            Customer c = new Customer("Jesssica", "Jones");
            view.drawScreen(c);
        }

        public void createCustomer(ActionEvent actionEvent) {

            String custType = ;

            Customer c = new Customer(name,email);
        }

        public void checkOutBook(){
            //get the date
            LocalDate dt = LocalDate.now();
            //add to that date
            //get the due date
        }

    }

    }

