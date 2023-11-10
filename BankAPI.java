/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

import java.util.Vector;

/**
 *
 * @author Medo
 */
public class BankAPI {
    private static Vector<String> BankNumbersList ;

    public BankAPI(){
        BankNumbersList = new Vector<String>() ;
        BankNumbersList.add("01234567890");
        BankNumbersList.add("12345678901");
        BankNumbersList.add("23456789012");
        BankNumbersList.add("34567890123");
    }
    
    public static void add(String bankNumber){
        BankNumbersList.add(bankNumber);
    }
    
    public static Vector<String> getBankNumbersList() {
        return BankNumbersList;
    }
    
    public static boolean isFoundBankID(String bankNumber){
        for(String bn : BankNumbersList){
            if(bankNumber.equals(bn)){
                return true ;
            }
        }
        return false ;
    }
 
}
