import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PerfectSquareTest{

    @Test
    
    public void testThatNegativeAreNotCountedAsPerfectSquares(){
    int[] array = {14, 9, 6, -9, -25, 36};
    int[] expected = PerfectSquare.getPerfectSquare(array);
    int[] actual = {9, 36};
    assertArrayEquals(actual, expected);
    }
    
    @Test
    
    public void testThatGetPerfectSquareReturnsPerfectSquares(){
    int[] array = {14, 9, 6, 0, 25, 36};
    int[] expected = PerfectSquare.getPerfectSquare(array);
    int[] actual = {9, 0, 25, 36};
    assertArrayEquals(actual, expected);
    }
    
    

    










}
