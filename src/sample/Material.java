package sample;

import javafx.collections.ObservableArrayBase;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;
import java.util.Observable;

public abstract class Material extends Observable {

    int Material_id;
    boolean checkedOut;
    String dueDate;
    int checkOutTime;
    String title;

    public Material(String title){
        this.title = title;
        checkedOut = false;
    }
//to see if the item is already taken
    public boolean isCheckedOut(){

        return checkedOut;
    }

//then if u checkout the item then checkOut would be true
    public void checkOut(){

        checkedOut = true;
        setChanged();
        notifyObservers();
    }
    //calculate due date
    public void calculateDueDate() {
        java.util.Date dt = java.sql.Date.valueOf(LocalDate.now());
        SimpleDateFormat formatter = new SimpleDateFormat("MM dd, yyyy");
        System.out.println(formatter.format(dt));

        LocalDate dt2 = LocalDate.now();
        LocalDate dt3 = dt2.plusDays(14);
        System.out.println(dt2);
        System.out.println(dt3);
    }

    public void returnMaterial(){
        setChanged();
        notifyObservers();
    }

    public void renewMaterial(){
        setChanged();
        notifyObservers();
    }

    public ArrayList getStatus(){
        ArrayList l = new ArrayList();
        l.add(checkedOut);
        l.add(dueDate);
        return l;
    }
}






