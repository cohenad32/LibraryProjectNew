package sample;

import java.sql.*;

public class SqlStatement {
    public static void sqlStatement(String sql){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
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
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(sql);
        } catch (SQLException s) {
            System.out.println("Error! " + s.getErrorCode());
            s.printStackTrace();
        }
        return rs;
    }

}