import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PalindromicTest{

    @Test
    
    public void testThatIsPalindromicReturnsFalseForNonPalindromicArray(){
    int[] array = {14, 9, 6, 5, 8, 10};
    boolean actual = Palindromic.isPalindromic(array);
    boolean expected = false;
    assertEquals(actual, expected);
    }
    
    @Test
    
    public void testThatIsPalindromicReturnsTrueForPalindromicArray(){
    int[] array = {45, 0, 8, 0, 45};
    boolean actual = Palindromic.isPalindromic(array);
    boolean expected = true;
    assertEquals(actual, expected);
    }
    

}
