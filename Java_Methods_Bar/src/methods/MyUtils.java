/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

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
} //end findItem(); 
    
} //end class


