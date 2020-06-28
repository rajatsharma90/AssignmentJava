/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharma_hwk5;

import java.text.NumberFormat;

public class Convertible extends Car {
    
    private double engineCapacity;
    public double topSpeed;
    

    public Convertible(String name,double mpg, int seat, double CostPrice,double cc) {
        super(name,mpg, seat, CostPrice);
        engineCapacity=cc;
        
    }
    
    public void setEngineCapacity(double engineCapacity){
        this.engineCapacity=engineCapacity;
       
    }
    
    public double getEngineCapacity(){
        return engineCapacity;
    }
    
    public String TopSpeed(){
    topSpeed=getMpg()*engineCapacity*3;
    return dfmt.format(topSpeed) ;
    }
    
    public String toString(){
        String c="\nEngine capacity in liters : "+engineCapacity+
                "\nTop Speed :"+TopSpeed()+"mph";
        return super.toString() + c;
    }
    
    }
    

