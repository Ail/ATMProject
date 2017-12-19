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
public class Account {
    
    private double balance;
    
    //deposit
    public void deposit(double amount){
        balance = balance + amount;
    }

    //withdraw
    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            System.err.println("Your balance is: " + getBalance());
        }
    }
    
    // get balance
    public double getBalance(){
        return balance;
    }
    
    
    
}
