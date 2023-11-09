/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dummy.instapay;

/**
 *
 * @author Medo
 */
public enum ElecCompany {

    NORTHCAIRO,SOUTHCAIRO,DELTA,SUEZCANNAL;
    public static ElecCompany fromString(String text) {
        for (ElecCompany company : ElecCompany.values()) {
            if (company.name().equalsIgnoreCase(text)) {
                return company;
            }
        }
        return null;
    }
}
