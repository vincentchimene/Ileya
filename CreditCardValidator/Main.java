import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Hello, kindly Enter Card details to verify\nEnter digits only!");
        String stringDigits = inputCollector.next();
        int[] arrayDigits = CreditCardValidator.convertStringDigitsToArray(stringDigits);
        
        int total = CreditCardValidator.totalSum(CreditCardValidator.getSumEverySecondDigitDoubled(arrayDigits), CreditCardValidator.getSumOfDigitsInOddIndices(arrayDigits));
       
        
        System.out.println("*********************************************************");
        System.out.printf("**Credit Card Type: %s%n", CreditCardValidator.checkCardType(arrayDigits));
        System.out.printf("**Credit card Number: %s%n", stringDigits);
        System.out.printf("**Credit card Digit Length: %d%n", stringDigits.length());
        System.out.printf("**Credit card Validity Status: %s%n", CreditCardValidator.getCardValidity(arrayDigits, total));
        System.out.println("*********************************************************");
        
        
    
    
    
    }


}
