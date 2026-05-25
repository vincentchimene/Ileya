import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArraySplitterTest{

    @Test
    
    public void testThatGetSplitArraySplitsGivenArrayIntoA2DArrayOfEvenAndOddPosition(){

    int[] array = {45, 60, 3, 10, 9, 22};
    int[][] actual = ArraySplitter.getSplitArray(array);
    int[][] expected = {{45, 3, 9}, {60, 10, 22}};
    assertArrayEquals(actual, expected);
    }
    

}


//javac -cp "junit-platform-console-standalone-1.11.0.jar:out" -d out ArraySplitterTest.java ArraySplitter.java


//java -cp "junit-platform-console-standalone-1.11.0.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path
