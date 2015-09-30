/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;
/**
 *
 * @author Cody
 */
public class Program {
    
    public int addition(int numberOne, int numberTwo){
        int result = numberOne + numberTwo;
        return result;
    }
    
    public int subtraction(int numberOne, int numberTwo){
        int result = numberOne - numberTwo;
        return result;
    }
    
    public int multiply(int numberOne, int numberTwo){
        int result = numberOne * numberTwo;
        return result;
    }
        
    public int division(int numberOne, int numberTwo){
        int result = numberOne / numberTwo;
        return result;
    }
    
    public int modulus(int numberOne, int numberTwo){
        int result = numberOne % numberTwo;
        return result;
    }
    
    public int exponent(int numberOne, int numberTwo){
        int result = (int) Math.pow(numberOne, numberTwo);
        return result;
    }
}
