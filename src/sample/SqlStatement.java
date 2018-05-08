package sample;

import java.sql.*;

public class SqlStatement {
    public static void sqlStatement(String sql){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            Statement statement = conn.createStatement();
            statement.execute(sql);
            conn.close();
        }
        catch (SQLException s) {
            System.out.println("Error!" + s.getSQLState());
        }
    }

    //for int
    public static int sqlQuery(String sql, String column) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            int ans = rs.getInt(column);
            conn.close();
            return ans;
        } catch (SQLException s) {
            System.out.println("Error! " + s.getErrorCode());
            s.printStackTrace();
        }
        return -1;
    }

    public static void sqlUpdate(String sql) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/RivkaAxelrod/Documents/Stern College/1st year/Spring 2018/Object Oriented/Projects/LibraryProjectNew/src/sample/LibraryDatabase.sqlite");
            Statement statement  = conn.createStatement();
            statement.executeUpdate(sql);
            conn.close();
        } catch (SQLException s) {
            System.out.println("Error! " + s.getErrorCode());
            s.printStackTrace();
        }
    }

}