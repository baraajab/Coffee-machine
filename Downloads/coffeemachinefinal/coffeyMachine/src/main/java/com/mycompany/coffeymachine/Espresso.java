
package com.mycompany.coffeymachine;

/**
 *
 * @author 97056
 */

public abstract class Espresso extends Grinder {
    
    
    public Espresso(int amountofsugar,Beans beans) {
        super("Espresso",beans, 7, 30, 5,amountofsugar, 100, 5);
        
    };
    
      public  Espresso(double amountofsugar,Beans beans) {
        super("Espresso", beans, 14, 60, 10, (int)amountofsugar, 200, 10);
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

  