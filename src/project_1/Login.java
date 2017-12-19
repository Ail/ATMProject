/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author george
 */
public class Login {
    
    private String username;
    
    private String password;
    
    private static Scanner x;
    
    public String getUsername(){
        return this.username;
    }
     
     public String getPassword(){
        return this.password;
    }
     
    public void verifyLogin(String username, String password){
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
                
        
           
        for(int i=1; i<=3; ++i){
            System.out.println("Enter your usename");
            tempUsername = x.next();
            System.out.println("Enter your password");
            tempPassword = x.next();

            if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                found = true;
            }
        }
        System.out.println("Try again later");
        x.close();
        System.out.println(found);
        
        
    }
    
}
