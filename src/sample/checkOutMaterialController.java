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
        String itemTitle = view.materialTitle();
        int mID = Material.findMaterial(itemTitle);



    }

    public void returnItem(ActionEvent actionEvent) {
    }


    class View{
        public Customer generateCustomer(){
            String email = custEmail.getText();
            Customer c = new Customer.Builder().email(email).build();
            return c;
        }

        public String materialTitle(){
            String itemTitle = title.getText();
            return itemTitle;
        }
    }
    // Material.findMaterial takes title and returns id of the material that is not checked out. returns -1 if all checked out

    // Customer.checkOut(takes a material)

    // when book is checked out, look up material id, generate material using id and then call checkout function
    // and put material in

}
