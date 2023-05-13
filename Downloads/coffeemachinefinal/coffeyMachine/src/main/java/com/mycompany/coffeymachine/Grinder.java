/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeymachine;

/**
 *
 * @author 97056
 */

    public abstract class Grinder {

    /**
     *
     */
   private final String type;
      private final int amountofBeans;
   private final Beans beans;
    private final int amountOfWater;
      private final int amountOfMilk;
      private final int amountOfSugar;
      private final int caffeineLevel;
  private final  int calories;

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
    public Grinder(String type,Beans beans, int amountOfBeans, int amountOfWater, int amountOfMilk, int amountOfSugar, int caffeineLevel, int calories) {
        this.type = type;
        this.amountofBeans = amountOfBeans;
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfSugar = amountOfSugar;
        this.caffeineLevel = caffeineLevel;
        this.calories = calories;
        this.beans=new Beans(beans.getName(), beans.getRoast());
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
        return "   [Coffee]   " +"\n"+ "type= " + type +"\n"+  ", Amount Of Water= " + amountOfWater + "\n"+ ", Amount Of Milk= " + amountOfMilk + "\n"+ ", Amount Of Sugar= " + amountOfSugar + "\n"+ ", Caffeine Level= " + caffeineLevel + "\n"+ ", calories= " + calories +  beans.GetInfo();
    }

  
}




