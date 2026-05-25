public class Palindromic{
    public static boolean isPalindromic(int[] array){
        boolean check = true;

    for(int index = 0; index < (array.length)/2; index++){
        if(array[index] != array[array.length -1 -index]){
            check = false;
            break;
        }    
    }
        
        return check;
    }  
    
    public static void main(String[] args){
        int[] array = {45, 0, 8, 0, 45};
        System.out.println(isPalindromic(array));
                
    }
    
}
