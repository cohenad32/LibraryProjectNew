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

    public Material(int mid ){
        this.Material_id = mid;
        checkedOut = false;
    }
//to see if the item is already taken
    public boolean isCheckedOut(){

        return checkedOut;
    }

//then if u checkout the item then checkOut would be true
    public void checkOut(String email){
        SqlStatement.sqlStatement("insert into Taken_out values('"+email+"','"+Material_id+"','"+this.calculateDueDate()+"','"+0+"')");
        checkedOut = true;
        setChanged();
        notifyObservers();
    }
    //calculate due date
    public LocalDate calculateDueDate() {
        LocalDate dueDate = LocalDate.now().plusDays(getCheckOutTime());
        return dueDate;
    }

    public void returnMaterial(String email){
        SqlStatement.sqlStatement("delete from Taken_out where m_email = '"+email+"' and Material_id = '"+Material_id+"'");
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

    public int getCheckOutTime() {
        return checkOutTime;
    }
}






