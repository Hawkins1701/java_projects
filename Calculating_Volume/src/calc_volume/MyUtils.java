/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc_volume;

    import java.text.DecimalFormat; 
/**
 *
 * @author michael.knudsen
 */
public class MyUtils {
 
//user defined method 
//accessiibility returnType methodName(datatype paramName, ---) 
public static String formatNum(float value, String fmt) {
    String result ="";
    DecimalFormat df = new DecimalFormat(fmt);
    result = df.format(value); 
                            
    return result; 
} // end formatNum 

public static String formatDouble(double value, String fmt) {
    String result ="";
    DecimalFormat df = new DecimalFormat(fmt);
    result = df.format(value); 
                            
    return result; 
} // end formatNum 


public static boolean isInteger(String s) {
    //introduces structured exception handling 
    boolean result = false; 
    try {
        int val = Integer.parseInt(s); 
        return true;
    }
    
    catch(Exception ex) {
        return false; 
    } //end isInteger();
}   

public static boolean isDouble(String s) {
    //introduces structured exception handling 
    boolean result = false; 
    try {
        double val = Double.parseDouble(s); 
        return true;
    }
    
    catch(Exception ex) {
        return false; 
    } //end isInteger();
}  

public static boolean isFloat(String s) {
     //Challenge option to test if a number is a float
    boolean result = false; 
    try {
        float val = Float.parseFloat(s);
        return true;
    }
   
    catch(Exception ex){
        return false;  
    }
}
    
public static int tryParseInt(String s, int defaultVal) {
    //introduces structured exception handling 
    try {
       return Integer.parseInt(s); 
    }
    
    catch(Exception ex) {
        return defaultVal; 
    }
} //end tryParseInt();
// pass an array of integer values as a parameter and search for value 

public static float tryParseFloat(String s, float defaultVal) {
    
    try {
        return Float.parseFloat(s);
    }
    
    catch (Exception ex) {
        return defaultVal; 
    }
}

public static int findItem(int values[] , int valueToFind) {
    //local variables 
    int i = 0; 
    int index = -1; 
    int len = values.length; 
    
    while (i < len && index == -1){
        if(valueToFind == values[i]) {
            index = i; 
        }
        i++; 
    } //end while 
    return index;
} //end findItem(); 
public static int findItem(String values[] , String valueToFind) {
    //local variables 
    int i = 0; 
    int index = -1; 
    int len = values.length; 
    //int len = values.length; 
    //int index = -1; 
    
    while (i < len && index == -1){
        if (valueToFind.equalsIgnoreCase(values[i])) {
            index = i; 
        }
        i++; 
    } //end while 
    return index;
}//end findItem(); 

public static float calcCommission (float salesAmount){
    double dcommission = 0; 
    float fcommission = 0; 
    if (salesAmount < 200) { 
       dcommission = salesAmount * 0.03; 
       fcommission = (float)dcommission; 
    } else if (salesAmount >= 200 && salesAmount < 500) {
        dcommission = salesAmount * 0.06; 
        fcommission = (float)dcommission; 
    } else if (salesAmount >= 500 && salesAmount < 1000) {
        dcommission = salesAmount * 0.08; 
        fcommission = (float)dcommission; 
    } else {
        dcommission = salesAmount * 0.10; 
        fcommission = (float)dcommission; 
    }
    return fcommission;
}
    
public static float calcSalesTax (double salesAmount){
    
    double TAXRATE = 0.0775; 
    double salesTaxAmount = salesAmount * TAXRATE; 
    
    return (float) salesTaxAmount; 
}

public static String moneyFormatting (float inputNumber) {
    String outputNumber = null; 
    if (inputNumber < 10) {
            outputNumber = MyUtils.formatNum(inputNumber,"$0.00");
        } else if (inputNumber >= 10 && inputNumber < 100){
            outputNumber = MyUtils.formatNum(inputNumber,"$00.00");
        } else if (inputNumber >= 100 && inputNumber < 1000){
            outputNumber = MyUtils.formatNum(inputNumber, "$000.00");
        } else if (inputNumber >= 1000 && inputNumber < 10000){
            outputNumber = MyUtils.formatNum(inputNumber, "$0,000.00"); 
        } else if (inputNumber >= 10000 && inputNumber < 100000) {
            outputNumber = MyUtils.formatNum(inputNumber, "$00,000.00"); 
        } else if (inputNumber >= 100000 && inputNumber < 1000000){
            outputNumber = MyUtils.formatNum(inputNumber, "$000,000.00");
        } else if (inputNumber >= 1000000 && inputNumber < 10000000){
            outputNumber = MyUtils.formatNum(inputNumber, "$0,000,000.00");
        }
    return outputNumber;
}

public static float calcFinalPrice (float salesAmount, float commission, float salesTax) {
    
    float finalPrice = (salesAmount - commission + commission) + salesTax;
    return finalPrice;
}
} //end class


