/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeymachine;

/**
 *
 * @author 97056
 */
public class WaterTank {
    private int capasity;

    public WaterTank(int capasity) {
        this.capasity = capasity;
    }
    public void waterdrain(int drain)
    {
        capasity-=drain;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }
    
}
