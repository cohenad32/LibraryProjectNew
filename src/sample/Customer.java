package sample;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

import static sample.SqlStatement.sqlStatement;

//changed constructor and create member
public abstract class Customer {//abstract b/c law of demeter- never extend a class only if its an abstract class
    String firstName;
    String lastName;
    String email;
    int numRenews;
    int id;

    //constructor
    public Customer(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        // items = new ArrayList<Material>(); //your items will be a list of materials that you add into it
    }

    public void addMember(){
        sqlStatement("insert into Library_Members values('"+firstName+"','"+lastName+"','"+email+"','"+this.getClass()+"','"+id+"')");
    }

    //getter
    public int getNumRenews(){
        return numRenews;
    }

    //when you check out what is the list of materials your getting
    public void checkOut(Material m, int itemId){
        LocalDate dueDate = LocalDate.now().plusDays(14);
        sqlStatement("insert into Taken_out values('"+id+"','"+itemId+"','"+dueDate+"')");
        m.checkOut(); //take that book item and set the boolean to true and calculate checkout date

    }


}