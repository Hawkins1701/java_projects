/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars_and_pizza_order;

/**
 *
 * @author Mikey
 */
public class Car {

    String make;
    String model;
    String color;
    float price;
    String vin;
    String priceAsString;

    public Car() {
       make = ""; 
       model = "";
       color = "";
       price = 0;
       vin = ""; 
       priceAsString = ""; 
    }
    
    public Car (String make, String model, String color, float price, String vin){
        this.make = make; 
        this.model = model; 
        this.color = color; 
        this.price = price; 
        this.vin = vin; 
    }
    
    public String getMake(){
        return make; 
    }
    
    public void setMake(String make){
        this.make = make; 
    }
    
    public String getModel(){
        return model; 
    }
    
    public void setModel(String model){
        this.model = model; 
    }
    
    public String getColor(){
        return color; 
    }
    
    public void setColor(String color){
        this.color = color; 
    }
    
    public float getPrice(){
        return price; 
    }
    
    /**public void setPrice(float price){
        this.price = price; 
    }**/
    
    public String formatPrice(float price){
        priceAsString = MyUtils.moneyFormatting(price); 
        return priceAsString; 
    }
    
    public String getVin(){
        return vin; 
    }
    
    public void setVin(String vin){
        this.vin = vin; 
    }
    
    public String formatCarInfo(){
        String CarInfo;
        CarInfo = make + " -- " +  model + " -- " + color + " -- " + priceAsString + " -- " + vin;
        return CarInfo; 
    } 
}

