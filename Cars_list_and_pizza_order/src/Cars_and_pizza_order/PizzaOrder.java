/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars_and_pizza_order;
    
/**
 *
 * @author Mikey
 */
public class PizzaOrder {
    String lastName;
    String firstName; 
    String streetAddress;
    String zipCode; 
    int numberOfPizzas;
    int pizzaSize;
    String phoneNumber; 
    String toppingsList;
    String pizzaDisplayedPrice; 
    int EIGHT_INCH_PRICE = 6; 
    int TWELVE_INCH_PRICE = 8; 
    int EIGHTEEN_INCH_PRICE = 12; 
    int TWENTY_FOUR_INCH_PRICE = 20; 
    float pizzaPriceFloat; 
    String pizzaDisplayedSize; 
    String phoneNumberDisplayed; 

    
    public void Pizza() {
          lastName = "";
          firstName = "";
          streetAddress = ""; 
          zipCode = "";
          numberOfPizzas = 0; 
          pizzaSize = 0; 
          phoneNumber = ""; 
          toppingsList = ""; 
          pizzaPriceFloat = 0; 
          pizzaDisplayedPrice = ""; 
          phoneNumberDisplayed = "";
    }
    
    public void Pizza (String lastName, String firstName, String streetAddress, String zipCode, int numberOfPizzas, int pizzaSize, String phoneNumber, String toppingsList){
        this.lastName = lastName;
        this.firstName = firstName; 
        this.streetAddress = streetAddress; 
        this.zipCode = zipCode; 
        this.numberOfPizzas = numberOfPizzas; 
        this.pizzaSize = pizzaSize; 
        this.phoneNumber = phoneNumber; 
        this.toppingsList = toppingsList; 
    }
 
    public String getLastName(){
        return lastName; 
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName; 
    }
    
    public String getFirstName(){
        return firstName; 
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }
    
    public String getStreetAddress(){
        return streetAddress;
    }
    
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress; 
    }
    
    public int getNumberOfPizzas(){
        return numberOfPizzas; 
    }
    
    public void setNumberOfPizzas(int numberOfPizzas){
        this.numberOfPizzas = numberOfPizzas; 
    }
    
    public int getPizzaSize() {
        return pizzaSize; 
}
    
    public void setPizzaSize(int PizzaSize){
        this.pizzaSize = pizzaSize; 
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getToppingsList(){
        return toppingsList;  
    }
    
    public void setToppingsList(String toppingsList){
        this.toppingsList = toppingsList; 
    }
    
    public String getZipCode(){
        return zipCode;
    }
    
    public void setZipCode(String zipCode){
        this.zipCode = zipCode; 
    }
    
    public String formatPizzaPrice (int pizzaSize){
        if (pizzaSize == 0){
            pizzaPriceFloat = EIGHT_INCH_PRICE * numberOfPizzas;
            pizzaDisplayedPrice = MyUtils.moneyFormatting(pizzaPriceFloat);   
        } else if (pizzaSize == 1){
            pizzaPriceFloat = TWELVE_INCH_PRICE * numberOfPizzas;
            pizzaDisplayedPrice = MyUtils.moneyFormatting(pizzaPriceFloat);
        } else if (pizzaSize == 2){
            pizzaPriceFloat = EIGHTEEN_INCH_PRICE * numberOfPizzas;
            pizzaDisplayedPrice = MyUtils.moneyFormatting(pizzaPriceFloat);
        } else if (pizzaSize == 3){
            pizzaPriceFloat = TWENTY_FOUR_INCH_PRICE * numberOfPizzas;
            pizzaDisplayedPrice = MyUtils.moneyFormatting(pizzaPriceFloat);
        }
        
        return pizzaDisplayedPrice;
    }
    
    public String displayPizzaSize(int pizzaSize){
        if (pizzaSize == 0){
            pizzaDisplayedSize = "Eight-inch"; 
        } else if (pizzaSize == 1){
            pizzaDisplayedSize = "Twelve-inch";
        } else if (pizzaSize == 2){
            pizzaDisplayedSize = "Eighteen-inch";
        } else if (pizzaSize == 3){
            pizzaDisplayedSize = "Twenty-four inch"; 
        }
        
        return pizzaDisplayedSize; 
    }
    
     public String formatPhoneNumber (String phoneNumber){
       phoneNumberDisplayed = MyUtils.formatNum(Float.parseFloat(phoneNumber), "000 000-0000");
       return phoneNumberDisplayed;   
    }
     
    public String formatOrder(){
        String pizzaOrderInListBox; 
        pizzaOrderInListBox = firstName + " " + lastName + " -- " + streetAddress + " -- " + zipCode + " -- " + phoneNumber + " ** " + numberOfPizzas + "  " + pizzaDisplayedSize + " " + toppingsList + " -- " + pizzaDisplayedPrice;
        return pizzaOrderInListBox;
    }
    
   
}


