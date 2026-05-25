import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NonPerfectSquareTest{

    @Test
    
    public void testThatNegativeAreNotCountedAsPerfectSquares(){
    int[] array = {14, 9, 6, -9, -25, 36};
    int[] expected = NonPerfectSquare.getPerfectSquare(array);
    int[] actual = {-1, 9, -1, -1, -1, 36};
    assertArrayEquals(actual, expected);
    }
    
    @Test
    
    public void testThatGetPerfectSquareReturnsPerfectSquaresAndMinus1ForNonPerfectSquares(){
    int[] array = {14, 9, 6, 0, 25, 36};
    int[] expected = NonPerfectSquare.getPerfectSquare(array);
    int[] actual = {-1, 9, -1, 0, 25, 36};
    assertArrayEquals(actual, expected);
    }
    
    

    










}
