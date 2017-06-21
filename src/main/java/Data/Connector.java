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

/**
 *
 * @author ivoni
 */
public class Connector {
    
        private static final String ip	     = "104.236.240.10";
        private static final String driver = "com.mysql.jdbc.Driver";
	private static final int    port     = 3306;
	public static final String database  = "carport";
	private static final String username = "fogUser"; 
	private static final String password = "zQBL8_jjC";
        private static Connection conn = null;
        
              
        public static Connection getConnection() throws SQLException {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
           String url = "jdbc:mysql://" + ip + ":" + port + "/" + database;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            return conn;
        }
        
        /**
	 * Executes the query on the database
	 * 
	 * @param query the query to be executed
	 * @return a ResultSet containing the rows which fulfills the query
         * @throws java.sql.SQLException
	 */
	public static ResultSet doQuery(String query) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeQuery(query);
	}

	/**
	 * Executes an update on the database
	 * 
	 * @param query the query to be executed
	 * @return 1 if update successful, else 0
	 * @throws SQLException
	 */
	public boolean doUpdate(String query) throws SQLException {
		Statement statement = conn.createStatement();
		return statement.executeUpdate(query) > 0;
	}
	
	/**
	 * Create a prepared statement
	 * 
	 * @param query the content of the statement
	 * @return the statement
	 * @throws SQLException
	 */
	public PreparedStatement prepareStatement(String query) throws SQLException{
		Statement statement = conn.createStatement();
		return statement.getConnection().prepareStatement(query);
	}
        
}
