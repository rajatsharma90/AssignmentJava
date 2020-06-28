/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharma_hwk5;

/**
 *
 * @author rajatsharma
 */
public class Car extends Vehicle{
    
    private double CostPrice;
    private double SellingPrice;
    
    public Car(String name,double mpg, int seat,double CostPrice) {
        super(name,mpg, seat);
        this.CostPrice=CostPrice;
        CalcSellingPrice();
    }
    
    public void setCostPrice(double price){
        this.CostPrice=CostPrice;
    }
    
    public double getCostPrice(){
        return CostPrice;
    }
    
    public String CalcSellingPrice(){
        if(getSeat()>5){
            SellingPrice=CostPrice+5000;
            // adding a comment no no. no

        }
        else if(getSeat()>2&&getSeat()<=5){
            SellingPrice=CostPrice+7500;
        }
        else{
            SellingPrice=CostPrice+(.2)*CostPrice;
        }
        
        return fmt.format(SellingPrice);
    }
    
    @Override
    public String toString(){
        String S="\nCost Price :"+fmt.format(CostPrice)+
                "\nSelling Price :"+fmt.format(SellingPrice);       
        return super.toString() + S ;
         
    }
    
}
