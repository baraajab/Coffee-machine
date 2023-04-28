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
public class Americano extends Coffee {
      public Americano(int amountofsugar,String nameOfBeans,int roastOfbeans) {
        super("Americano",nameOfBeans,roastOfbeans, 7, 30, 0,amountofsugar, 100, 5);
    };
        public Americano(double amountofsugar,String nameOfBeans,int roastOfbeans) {
        super("Americano",nameOfBeans,roastOfbeans, 7, 30, 0,(int)amountofsugar, 200, 10);
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
