/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

/**
 *
 * @author george
 */
public class Project_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
//        Account account1 = new Account();
//        account1.getBalance();
//        
//        Account account2 = new Account();
//        account2.deposit(100);
//        
//        System.out.println(account1.getBalance());
//        System.out.println(account2.getBalance());

//        String userName = "user1";
//        String passWord = "pass1";
//        String filepath = "members.txt";
//        
        Login login = new Login();
        login.verifyLogin(userName, passWord);
        
        
    }
    
}
