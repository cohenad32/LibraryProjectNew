package sample;

import java.sql.*;

public class SqlStatement {
    public static void sqlStatement(String sql){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryApplication/src/sample/LibraryDatabase.sqlite");;
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
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/ayliana/CS/IdeaProjects/LibraryApplication/src/sample/LibraryDatabase.sqlite");
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