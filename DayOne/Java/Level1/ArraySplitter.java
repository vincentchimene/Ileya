import java.util.Arrays;
public class ArraySplitter{
    public static int[][] getSplitArray(int[] array){
        int lengthOfEven = (array.length + 1) / 2;
        int lengthOfOdd = (array.length) / 2;
        
        int [][] splitArray = new int[2][];
        splitArray[0] = new int[lengthOfEven];
        splitArray[1] = new int[lengthOfOdd];
        
        int evenCount = 0;
        int oddCount = 0;
        
        for(int index = 0; index < array.length; index++){
            if(index % 2 == 0){
                splitArray[0][evenCount] = array[index]; 
                evenCount++;
            }
            else{
                splitArray[1][oddCount] = array[index];
                oddCount++;
            }
        }
        
        return splitArray;
        
    
    }
    
    public static void main(String[] args){
        int[] array = {45, 60, 3, 10, 9, 22};
        System.out.println(Arrays.deepToString(getSplitArray(array)));
        
    }



}
