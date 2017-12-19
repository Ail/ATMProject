/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author george
 */
public class DB {
    
        private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private static final String DB_URL = "jdbc:mysql://localhost/afdemp_java_1";
    
    
        private static final String USER = "root";
        private static final String PASS = "admin";
        
    public void databasez(){
        
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to Database");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT  username, password FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            
            
            List<String> username = new ArrayList<String>();
            List<String> password = new ArrayList<String>();
            while(rs.next()){
                
                username.add(rs.getString("username"));
                password.add(rs.getString("password"));
                
                
            }
            
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            
            try{
                if(stmt!=null)
                    stmt.close();
            }
            catch(SQLException se2){}
            try{
                if(conn!=null)
                    conn.close();
            }
            catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Finished!");
    }
}
