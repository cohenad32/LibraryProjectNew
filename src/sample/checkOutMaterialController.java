package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class checkOutMaterialController {
    public TextField title;
    public TextField custEmail;
    public Button checkOut;
    public Button returnItem;


    View view = new View();

    public void checkOut(ActionEvent actionEvent) {
        Customer c = view.generateCustomer();
        Material m = view.generateMaterial();
        c.checkOut(m);

    }

    public void returnItem(ActionEvent actionEvent) {
        Customer c = view.generateCustomer();
        Material m = view.generateMaterial();
        c.returnMaterial(m);
    }


    class View{

        // generates a customer
        public Customer generateCustomer(){
            String email = custEmail.getText();
            Customer c = new Customer.Builder().email(email).build();
            return c;
        }


        // checks what type of material it is and then generates a material accordingly
        public Material generateMaterial(){
            String itemTitle = title.getText();
            int mID = Material.findMaterial(itemTitle);
            String type = Material.getType(mID);
            if (type == "Tape"){
                Material m = new Tape(mID);
                return m;
            }
            else if (type == "Book"){
                Material m = new Book(mID);
                return m;
            }
            else{
                Material m = new DVD(mID);
                return m;
            }
        }
    }

}
