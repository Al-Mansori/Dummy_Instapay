/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public enum GazCompany {
    TAQA,PETROID,NATGAZ;
    public static GazCompany fromString(String text) {
        for (GazCompany company : GazCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }

};
