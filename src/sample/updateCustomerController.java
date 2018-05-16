package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class updateCustomerController {
    public TextField custEmail;
    public TextField newCustFirstName;
    public TextField newCustLastName;
    public TextField newEmail;
    public Button submitUpdates;

    View view = new View();


    // checks what needs to be updated and updates accordingly
    public void updateCustomer(ActionEvent actionEvent){
        Customer c = view.generateCustomer();
        //figure out the best way to implement this
        String[] toUpdate = view.generateUpdate();
        for (int i = 0; i<toUpdate.length; i++){
<<<<<<< HEAD
            if (!toUpdate[i].isEmpty()){
=======
            if (! toUpdate[i].isEmpty()){
>>>>>>> 1337b813f02bb241660c22c781f545be61228da4
                if (i == 0){
                    c.updateCust("First_name", toUpdate[i]);
                }
                else if (i==1){
                    c.updateCust("Last_name", toUpdate[i]);
                }
                else if (i==2){
                    c.updateCust("Email", toUpdate[i]);
                }
            }
        }

    }


    class View {
        // gets data that needs to be updated from the user
        public String[] generateUpdate() {
            String firstName = newCustFirstName.getText();
            String lastName = newCustLastName.getText();
            String email = newEmail.getText();
            return new String[]{firstName, lastName, email};

        }

        public Customer generateCustomer(){
            String email = custEmail.getText();
            Customer c = new Customer.Builder().email(email).build();
            return c;
        }
    }


}
