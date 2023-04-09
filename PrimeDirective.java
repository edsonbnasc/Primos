import java.util.ArrayList;


public class PrimeDirective {
    
    public static boolean isPrime(int number){  //metodo para ver se numero e primo   
        if(number<=1){
            return false;
        }
        for(int p=2; p<number; p++){
            if(number%p == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {
        PrimeDirective prime = new PrimeDirective();
        int[] numbers = {1,15,2,7,5,83,99,121};
        ArrayList<Integer> onlyPrime = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i]) ){
            onlyPrime.add(numbers[i]);    
            
        }    

    }
    System.out.println(onlyPrime + " é primo. ");
    }
}
    
    


    
