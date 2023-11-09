/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public class User {
    private String username ;
    private String password ;
    private Account account ;

    public User(String username, String password, Account account) {
        this.username = username;
        this.password = password;
        this.account = account;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public void loadProfile(){
        System.out.println("User Information:\nUserName: "+username+"\nPassword: "+password);
        account.loadProfile();
    }

}
