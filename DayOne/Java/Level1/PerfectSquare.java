import java.util.Arrays;
public class PerfectSquare{
    public static boolean isPerfectSquare(int number){
        boolean check = false;
        if(number < 0){
            check = false;
        }
        int squareRoot = (int)Math.sqrt(number);
        if(squareRoot * squareRoot == number){
            check = true;
        }
        return check;
    }
    
    public static int[] getPerfectSquare(int[] array){
        int countPerfectSquare = 0;
        int count = 0;
        for(int index = 0; index < array.length; index++){
            if(isPerfectSquare(array[index])){
                countPerfectSquare++;
            }
        }
        int[] perfectSquareArray = new int[countPerfectSquare];
        for(int index = 0; index < array.length; index++){
            if(isPerfectSquare(array[index])){
                perfectSquareArray[count] = array[index];
                count++;    
            }
        }
        return perfectSquareArray;
    }
    
    
     
    public static void main(String[] args){
        int[] array = {4, 0, 9, 0, 16, 18};
        System.out.println(Arrays.toString(getPerfectSquare(array)));
                
    }
    



}

