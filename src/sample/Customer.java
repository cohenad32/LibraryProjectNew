package sample;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

//changed constructor and create member
public abstract class Customer {//abstract b/c law of demeter- never extend a class only if its an abstract class
    String firstName;
    String lastName;
    String email;
    int numRenews;

    //constructor
    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
       // items = new ArrayList<Material>(); //your items will be a list of materials that you add into it
    }

    public void addMember(){
        SqlStatement.sqlStatement("insert into Library_Members values('"+firstName+"','"+lastName+"','"+email+"','"+this.getClass()+"')");
    }

    //getter
    public int getNumRenews(){
        return numRenews;
    }

    //when you check out what is the list of materials your getting
    public void checkOut(Material m, int itemId){
        LocalDate dueDate = LocalDate.now().plusDays(14);
        SqlStatement.sqlStatement("insert into Taken_out values("+itemId+"','"+dueDate+"')");
        m.checkOut(); //take that book item and set the boolean to true and calculate checkout date

    }

    public void returnMaterial(){}

    public void renewMaterial(){}

}
