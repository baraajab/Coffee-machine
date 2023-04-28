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
public abstract class Coffee {
      private String type;
    private int amountofBeans;
    private Beans beans;
    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfSugar;
    private int caffeineLevel;
   private int calories;

    /**
     *
     * @param type
     * @param nameOfBeans
     * @param roastOfBeans
     * @param amountOfBeans
     * @param amountOfWater
     * @param amountOfMilk
     * @param amountOfSugar
     * @param caffeineLevel
     * @param calories
     */
    public Coffee(String type,String nameOfBeans,int roastOfBeans, int amountOfBeans, int amountOfWater, int amountOfMilk, int amountOfSugar, int caffeineLevel, int calories) {
        this.type = type;
        this.amountofBeans = amountOfBeans;
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfSugar = amountOfSugar;
        this.caffeineLevel = caffeineLevel;
        this.calories = calories;
        this.beans=new Beans(nameOfBeans, roastOfBeans);
    }

   
    public abstract void brew();
    public abstract void pour();
    public abstract void clean();

    public String getType() {
        return type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public int getCalories() {
        return calories;
        
    }

    public int getAmountOfWater() {
        return amountOfWater;
    }

    public Beans getbeans() {
        return beans;
    }

    public int getAmountOfBeans() {
        return amountofBeans;
    }
    
 public void grindBeans(String grindingSize) {
        System.out.println("this coffee is grinding at size"+grindingSize);
    }
   
    public String getInfo() {
        return "Coffee{" + "type=" + type + ", beans=" + beans + ", amountOfWater=" + amountOfWater + ", amountOfMilk=" + amountOfMilk + ", amountOfSugar=" + amountOfSugar + ", caffeineLevel=" + caffeineLevel + ", calories=" + calories +  beans.GetInfo();
    }

}
