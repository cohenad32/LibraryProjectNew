package sample;

import java.sql.*;

public class SqlStatement {
    public static void sqlStatement(String sql){
        try {
<<<<<<< HEAD
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
=======
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
>>>>>>> 736ed95f2c929efb479e947ef57ebe87c5fc075f
            Statement statement = conn.createStatement();
            statement.execute(sql);
        }
        catch (SQLException s) {
            System.out.println("Error!" + s.getSQLState());
        }
    }

    public static ResultSet sqlQuery(String sql) {
        ResultSet rs = null;
        try {
<<<<<<< HEAD
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
=======
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
>>>>>>> 736ed95f2c929efb479e947ef57ebe87c5fc075f
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException s) {
            System.out.println("Error! " + s.getErrorCode());
            s.printStackTrace();
        }
        return rs;
    }

}

            /*ResultSet rs = statement.executeQuery("select * from Library_Members");
            while (rs.next()) {
                String firstName = rs.getString("First_name");
                String lastName = rs.getString("Last_name");
                String email = rs.getString("Email");
                System.out.println(firstName + " " + lastName + ": " + email);
            } */