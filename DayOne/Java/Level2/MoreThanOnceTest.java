import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MoreThanOnceTest{

    @Test
    
    public void testThatItCountEdgeDuplicates(){
    int[] array = {9, 9, 6, -9, 5, -25, -25};
    int[] expected = MoreThanOnce.getMoreThanOnce(array);
    int[] actual = {-25, 9};
    assertArrayEquals(actual, expected);
    }
    
        @Test
    
    public void testThatItCountsDuplicatesAppearingMoreThan2TimesJustOnce(){
    int[] array = {9, 9, 6, -9, 5, 9, 9, -25, -25};
    int[] expected = MoreThanOnce.getMoreThanOnce(array);
    int[] actual = {-25, 9};
    assertArrayEquals(actual, expected);
    }
    

    
    










}
