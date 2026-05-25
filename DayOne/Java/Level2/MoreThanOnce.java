/**
* Given an array of integers,
* return a new array containing only the values that appear more than once
* (no repeated entries in result).
* input → [1, 2, 3, 2, 4, 3] output → [2,3]
*/

import java.util.Arrays;
public class MoreThanOnce{
    public static int[] getMoreThanOnce(int[] array){
        Arrays.sort(array);
        int count = 0;
        if (array.length < 2) {
            return new int[0];
        }
        for(int index = 1; index < array.length; index++){
            if(array[index] == array[index - 1]){
                if(index == 1 || array[index] != array[index - 2]){
                    count++;
                }
            }
        }
        int newCount = 0;
        int[] result = new int[count];
        for(int index = 1; index < array.length; index++){
            if(array[index] == array[index - 1]){
                if (index == 1 || array[index] != array[index - 2]){
                    result[newCount] = array[index];
                    newCount++;
                }
            }   
        }
        
        return result;
            
    }
    
    public static void main(String[] args){
        int[] array = {9, 9, 6, -9, 5, 9, 9, -25, -25};
        System.out.println(Arrays.toString(getMoreThanOnce(array)));        
    }



}
