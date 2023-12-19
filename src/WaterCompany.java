/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public enum WaterCompany {
    CAIROWATER ,ALEXWATER;
    public static WaterCompany fromString(String text) {
        for (WaterCompany company : WaterCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }


};
