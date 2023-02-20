public class SumOfDigit {
   // static int sum =0;
    static void sumOfDigit(int num, int sum){
        if(num==0){
            System.out.println("Sum "+sum);
            return ;
        }
        int singleDigit = num % 10;
        sum = sum + singleDigit;
        sumOfDigit(num/10, sum);


    }
    public static void main(String[] args) {
        sumOfDigit(123,0);
    }
}
