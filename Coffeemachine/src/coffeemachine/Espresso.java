/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachine;

/**
 *
 * @author baka
 */
public abstract class Espresso extends Coffee {
       
    public Espresso(int amountofsugar,String nameOfBeans,int roastOfbeans) {
        super("Espresso",nameOfBeans,roastOfbeans, 7, 30, 0,amountofsugar, 100, 5);
    };
    
      public  Espresso(double amountofsugar,String nameOfBeans,int roastOfbeans) {
        super("Espresso",nameOfBeans,roastOfbeans, 14, 60, 0, (int)amountofsugar, 200, 10);
    }

    /**
     *
     * @param grindingSize
     */
    @Override
    public void grindBeans(String grindingSize) {
        System.out.println("this coffee is grinding at size"+grindingSize);
    }

    /**
     *
     */
    @Override
    public void brew() {
        System.out.println("it is brewing ............");
    }

    @Override
    public void pour() {
         System.out.println("it is pouring ...........");
    }

    @Override
    public void clean() {
        System.out.println("cleaning................");
    }

   
}
