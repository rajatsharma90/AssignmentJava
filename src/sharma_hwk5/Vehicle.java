/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharma_hwk5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author rajatsharma
 */
public abstract class Vehicle {
    private double mpg;
    private int seat;
    private String name;
    
    public Vehicle(String name,double mpg,int seat){
      this.name=name;
      this.mpg=mpg;
      this.seat=seat;
      
    }
    NumberFormat fmt=NumberFormat.getCurrencyInstance();
    DecimalFormat dfmt=new DecimalFormat("#");

    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
            
    
    
    public void setMpg(double mpg){
        this.mpg=mpg;
    }
    
    public void setSeat(int seat){
        this.seat=seat;
    }
    
    public double getMpg(){
        return mpg;
    }
    
    public int getSeat(){
        return seat ;
    }
    
    public String toString(){
        return "Name:"+name
              +"\nNumber of seats are : "+seat+
               "\nMiles per gallon : "+mpg;
    }
    
    
}
