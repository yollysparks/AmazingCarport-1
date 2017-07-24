/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


 public class Connector {

    private static final String USER = "root";
    private static final String USERPW = "casp6672";
    private static final String DBNAME = "Carport";
    // private static final String HOST = "188.166.91.15"; <-- For later usage
    
    private static Connection conn = null;
    
    public static Connection getConnection() {
        try {
            String url = String.format("jdbc:mysql://%s:3306/%s", DBNAME);
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, USER, USERPW);  
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }
        return null;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

	public static ResultSet doQuery(String query) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeQuery(query);
	}

	
	public boolean doUpdate(String query) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeUpdate(query) > 0;
	}
	
	
	public PreparedStatement prepareStatement(String query) throws SQLException{
		Statement statement = conn.createStatement();
		return statement.getConnection().prepareStatement(query);
	}
        
}
