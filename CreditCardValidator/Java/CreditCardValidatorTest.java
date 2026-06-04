import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest{


    @Test
    public void testThatConvertStringDigitsToArrayWorks(){
        String stringDigits = "47389885760139";
        int[] expected = {4, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9};
        int[] actual =  CreditCardValidator.convertStringDigitsToArray(stringDigits);
        assertArrayEquals(expected, actual);
    
    }
    
    @Test
    public void testThatGetSumEverySecondDigitDoubledWorks() {   
        int[] array = {4, 3, 8, 8, 5};
        int expected = 13;
        int actual = CreditCardValidator.getSumEverySecondDigitDoubled(array); 
        assertEquals(expected, actual);

        
        expected = 14;
        actual = CreditCardValidator.getSumEverySecondDigitDoubled(new int[]{4, 3, 8, 4, 5}); 
        assertEquals(expected, actual);
    
    }
    
    @Test
    public void testThatGetSumOfDigitsInOddIndicesWorks(){
        int[] array = {4, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9};       
        int expected = 44;
        int actual =  CreditCardValidator.getSumOfDigitsInOddIndices(array);
        assertEquals(expected, actual);  
    }
    
    @Test
    public void testThatTotalSumWorks() {
        int actual = CreditCardValidator.totalSum(13, 17);
        int expected = 30;
        assertEquals(actual, expected);
    }
    
    @Test
    public void testGetCardValidity(){
        int[] array = {4, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9};  
        int number = 70;     
        String expected = "Valid";
        String actual =  CreditCardValidator.getCardValidity(array, number);
        assertEquals(expected, actual); 
        
    } 
  
    
    
    @Test
    public void testThatCheckCardTypeWorksForAllCardTypesAndInvalidCardType(){
        int[] array = {4, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9};
        String actual = CreditCardValidator.checkCardType(array);
        String expected = "Visa Card";
        assertEquals(actual, expected);
        
        
        actual = CreditCardValidator.checkCardType(new int[]{5, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9});
        expected = "MasterCard";
        assertEquals(actual, expected);
        
        
        actual = CreditCardValidator.checkCardType(new int[]{6, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9});
        expected = "Discover Card";
        assertEquals(actual, expected);
        

        actual = CreditCardValidator.checkCardType(new int[]{3, 7, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9});
        expected = "American Express Card";
        assertEquals(actual, expected);
        
 
        actual = CreditCardValidator.checkCardType(new int[]{3, 5, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9});
        expected = "Invalid Card Type";
        assertEquals(actual, expected);     
        

        actual = CreditCardValidator.checkCardType(new int[]{9, 5, 3, 8, 9, 8, 8, 5, 7, 6, 0, 1, 3, 9});
        expected = "Invalid Card Type";
        assertEquals(actual, expected);                
        
    }
}



