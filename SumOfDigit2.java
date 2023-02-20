public class SumOfDigit2 {

    int sumOfDigit(int num){
        if(num==0){
          return 0;
        }
       
        int sum = sumOfDigit(num/10);
        int singleDigit = num % 10;
        return sum + singleDigit;
        // sum = sum + singleDigit;
        //sumOfDigit(num/10, sum);
       
    }
    public static void main(String[] args) {
        
    }
}
