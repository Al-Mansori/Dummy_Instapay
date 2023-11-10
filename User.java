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
    private String phoneNumber ;
    private AccountType accountType ;
    private Account account ;

    public User(String username, String password, String phoneNumber, AccountType accountType, Account account) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public void loadProfile(){
        System.out.println("User Information:\nUserName: "+username+"\nPassword: "+password+"\nPhone Number: "+phoneNumber+"\nAccount Type: "+accountType);
        account.loadProfile();
    }

}
