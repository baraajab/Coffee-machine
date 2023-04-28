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
public class Coffeemachineapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        CoffeeMachine machine = new CoffeeMachine(1000, 500);

      

       
        Espresso espresso = new Espresso(5, "Arabica", 5) {
        };

        
        machine.makeCoffee(espresso, "small");

    }
    
}
