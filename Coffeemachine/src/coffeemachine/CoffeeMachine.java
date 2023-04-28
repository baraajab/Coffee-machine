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
public class CoffeeMachine {
       private int waterCapacity;
    private int beanCapacity;
    private int cupsMade;
    

    public CoffeeMachine(int waterCapacity, int beanCapacity) {
        this.waterCapacity = waterCapacity;
        this.beanCapacity = beanCapacity;
        this.cupsMade = 0;
      
    }
  public void start(Coffee cof,String size) {
        System.out.println("Starting to make a " + cof.getType() + "...");
        cof.grindBeans(size);
        cof.brew();
        cof.pour();
        cof.clean();
        System.out.println("Finished making a " + cof.getType() + "!");
    }
    public void makeCoffee(Coffee coffee,String size) {
        

        if (waterCapacity < coffee.getAmountOfWater()|| waterCapacity>1000) {
            System.out.println("Error: Not enough water to make coffee!");
            return;
        }

        if (beanCapacity < coffee.getAmountOfBeans()|| beanCapacity>1000) {
            System.out.println("Error: Not enough coffee beans to make coffee!");
            return;
        }
       
        if (cupsMade >= 20) {
            coffee.clean();
            return;
        }

        System.out.println("Making a cup of " + coffee.getType() + "...");
       start(coffee,size);
        waterCapacity -= coffee.getAmountOfWater();
        beanCapacity -= coffee.getAmountOfBeans();
        cupsMade++;

        System.out.println("Coffee machine status:");
        System.out.println("- Water remaining: " + waterCapacity + "ml");
        System.out.println("- Coffee beans remaining: " + beanCapacity + "g");
        System.out.println("- Cups made: " + cupsMade);
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public int getBeanCapacity() {
        return beanCapacity;
    }

    public void setBeanCapacity(int beanCapacity) {
        this.beanCapacity = beanCapacity;
    }

    public int getCupsMade() {
        return cupsMade;
    }

    
    public String getinfo(Coffee cof)
    {
        return "{"+waterCapacity+beanCapacity+cupsMade+cof.getInfo()+"}";
    }

}
