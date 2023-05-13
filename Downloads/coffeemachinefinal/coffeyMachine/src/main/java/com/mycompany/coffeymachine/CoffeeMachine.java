/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeymachine;

import java.security.DrbgParameters;
import javax.swing.JOptionPane;

/**
 *
 * @author 97056
 */

     public class CoffeeMachine {
    private WaterTank watertank;
    private int beanCapacity;
    private int cupsMade;
    

    public CoffeeMachine(WaterTank watertank, int beanCapacity) {
        this.watertank = watertank;
        this.beanCapacity = beanCapacity;
        this.cupsMade = 0;
      
    }
  public void start(Grinder cof,String size) {
      
       if (watertank.getCapasity() < cof.getAmountOfWater()|| watertank.getCapasity()>1000) {
           JOptionPane.showMessageDialog(null, "Error: Not enough water to make coffee!");
           return ;
        }

        if (beanCapacity < cof.getAmountOfBeans()|| beanCapacity>1000) {
            JOptionPane.showMessageDialog(null, "Error: Not enough coffee beans to make coffee!");
           
        }
       
        if (cupsMade >= 20) {
          JOptionPane.showMessageDialog(null, "Error:Please Clean the Cups Trash");
        }
      
          watertank.waterdrain(cof.getAmountOfWater());
        beanCapacity -= cof.getAmountOfBeans();
        cupsMade++;
    }
  public void CupsTrash()
  {
      cupsMade=0;
      
     
  }
  

     

    
    
public void refillwatertank()
{
    watertank.setCapasity(1000);
}
public  void refillbeans()
{
    beanCapacity=1000;
}
    public int getWaterCapacity() {
        return watertank.getCapasity();
    }

    public void setWaterCapacity(int waterCapacity) {
        this.watertank.setCapasity(waterCapacity);
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

    
    public String getinfo(Grinder cof)
    {
        return "\n"+watertank.getCapasity()+"\n"+beanCapacity+"\n"+cupsMade+"\n"+cof.getInfo();
    }

   
}

