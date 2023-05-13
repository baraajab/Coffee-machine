/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeymachine;

/**
 *
 * @author 97056
 */
public class Beans {
   private String name;
   private int roast;

    public Beans(String name, int roast) {
        this.name = name;
        this.roast = roast;
    }

    public String getName() {
        return name;
    }

    public int getRoast() {
        return roast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoast(int roast) {
        this.roast = roast;
    }

  
    public String GetInfo() {
        return "\n"+"\n"+"\n"+"Beans"+"\n" + "name=" + name +"\n" +", roast= " + roast ;
    }
   
   
}
