package sample;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
//import.java.util.Observer;

//changed constructor and create member
public class Customer implements InvalidationListener{//abstract b/c law of demeter- never extend a class only if its an abstract class
    String firstName;
    String lastName;
    String email;
    int numRenews;

    //constructor
    public Customer(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       // items = new ArrayList<Material>(); //your items will be a list of materials that you add into it
    }

    //function that allows the customer to subscribe to materials
    public void observeMaterial(Observable material){
        material.addListener(this);
    }


    public void addMember(){
        SqlStatement.sqlStatement("insert into Library_Members values('"+firstName+"','"+lastName+"','"+email+"','"+this.getClass().getSimpleName()+"')");
    }

    public void updateCust(String field, String newValue){
        SqlStatement.sqlStatement("update Library_Members set "+field+" = '"+newValue+"' where Email = '"+email+"'");
    }

    //getter
    public int getNumRenews(){
        return this.numRenews;
    }

    //when you check out what is the list of materials your getting
    public void checkOut(Material m){
        m.checkOut(email); //take that book item and set the boolean to true and calculate checkout date

    }

    public void returnMaterial(Material m){
        m.returnMaterial(email);
    }

    public void renewMaterial(Material m){
        m.renewMaterial(getNumRenews());
    }
    //call getNumRenews and then you have template pattern

    //called by notifyObservers in materials
    public void update(Observable material) {
        Material m = (Material) material;
        ArrayList results = m.getStatus();
        boolean checkedOut = (boolean) results.get(0);
        String dueDate = (String) results.get(1);
    }

    @Override
    public void invalidated(Observable observable) {

    }

    public static class Builder{
        Customer c = new Customer();
        public Builder email(String email){
            c.email = email;
            return this;
        }

        public Builder firstName(String fName){
            c.firstName = fName;
            return this;
        }

        public Builder lastName(String lName){
            c.lastName = lName;
            return this;
        }

        public Builder firstName(){
            c.firstName = SqlStatement.sqlQueryString("select First_name from Library_Members where Email = '" + c.email + "'", "First_name");
            return this;
        }

        public Builder lastName(){
            c.lastName = SqlStatement.sqlQueryString("select Last_name from Library_Members where Email = '" + c.email + "'", "Last_name");
            return this;
        }


        public Customer build(){
            return c;
        }

    }

}
