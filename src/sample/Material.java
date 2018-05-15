package sample;

import javafx.collections.ObservableArrayBase;

import java.sql.ResultSet;
import java.sql.SQLException;
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

    public Material(int mid){
        this.Material_id = mid;
        checkedOut = false;
    }
//to see if the item is already taken
    public boolean isCheckedOut(){

        return checkedOut;
    }

    //find book that want to check out based on title
    public static int findMaterial(String title){
        int mID;
        try {
            mID = SqlStatement.sqlQuery("select Material_id from Material where Title = '" + title + "' and Material_id not in (select Material_id from Taken_out)", "Material_id");
        }
        catch(Exception e){
            mID = -1;
        }
        return mID;
    }

    public static String getType(int mid){
        return SqlStatement.sqlQueryString("select Type from Material where Material_id = '"+mid+"'", "Type");
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

    public boolean renewMaterial(int allowedRenews){
        int curRenew = this.getNumRenews();
        if (curRenew < allowedRenews){
            curRenew++;
            SqlStatement.sqlUpdate("update Taken_out set num_renews = "+curRenew+" where Material_id = " +Material_id);
        }
        else{
            return false;
        }
        setChanged();
        notifyObservers();
        return true;
    }

    public ArrayList getStatus(){
        ArrayList l = new ArrayList();
        l.add(checkedOut);
        l.add(dueDate);
        return l;
    }

    public int getNumRenews() {
        return SqlStatement.sqlQuery("select num_renews from Taken_out where Material_id = '" +Material_id+"'", "num_renews");
    }

    public int getCheckOutTime() {
        return checkOutTime;
    }
}






