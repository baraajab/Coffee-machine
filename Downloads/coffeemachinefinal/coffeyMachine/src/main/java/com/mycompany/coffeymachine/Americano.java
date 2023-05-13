/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeymachine;

/**
 *
 * @author 97056
 */

public  class Americano extends Grinder {

    public Americano(int amountofsugar,Beans beans) {
        super("Americano",beans, 7, 30, 15,amountofsugar, 100, 5);
    };
        public Americano(double amountofsugar,Beans beans) {
        super("Americano",beans, 14, 60, 30,(int)amountofsugar, 200, 10);
    };
    
    /**
     *
     * @param grindingSize
     */
    @Override
   public void grindBeans(String grindingSize) {
        System.out.println("this coffee is grinding at size"+grindingSize);
    }

    @Override
    public void brew() {
       System.out.println("it is brewing ..........");
    }

    @Override
    public void pour() {
        System.out.println("it is pouring ..........");
    }

    @Override
    public void clean() {
        System.out.println("cleaning..................");
    }

   
}