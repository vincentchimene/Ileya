public class CreditCardValidator{
    public static int[] convertStringDigitsToArray(String stringDigits){
        int[] arrayDigits = new int[stringDigits.length()];
        for(int count = 0; count < stringDigits.length(); count++){
            arrayDigits[count] = stringDigits.charAt(count) - '0';
        }
        return arrayDigits;
    
    }
    public static int getSumEverySecondDigitDoubled(int[] array){
        int sum = 0;
        for(int index = array.length - 2; index >= 0; index -= 2){
            if(array[index] * 2 >= 10){
                sum += ((array[index] * 2)/10 + (array[index] * 2)%10);
            }
            else{
                sum += array[index] * 2;
            }
        }
        return sum;
    
    }


    public static int getSumOfDigitsInOddIndices(int[] array){
        int sum = 0;
        for(int index = 0; index < array.length; index++){
            if(index % 2 != 0){
                sum += array[index];
            }
        }
        return sum;
    }
    
    
    
    public static int totalSum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    
    
    public static boolean isValid(int number){
        if(number % 10 == 0){
            return true;
        }
        else{
            return false;
        }
    
    }
    
    public static String checkCardType(int[] array){
        String cardType = "";
        if(array[0] == 4){
            cardType = "Visa Card";
        }
        else if(array[0] == 5){
            cardType = "MasterCard";
        }
        else if(array[0] == 6){
            cardType = "Discover Card";     
        }
        else if(array[0] == 3 && array[1] == 7){
            cardType = "American Express Card";
        }
        else{
            cardType = "Invalid Card";
        }
        return cardType;
   
    } 
    
    public static String checkDigitSize(int[] array){
        if(array.length < 13){
            return "Invalid Card";
        }
        else{
            return "Valid Card";
        }
    }

}
