import java.util.Arrays;
public class NonPerfectSquare{
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
        
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; index++){
            if(!isPerfectSquare(array[index])){
                result[index] = -1;    
            }
            else{
                result[index] = array[index];
            }
        }
        return result;
    }
    
    
     
    public static void main(String[] args){
        int[] array = {4, 15, 9, 0, 16, 18};
        System.out.println(Arrays.toString(getPerfectSquare(array)));
                
    }
    



}

