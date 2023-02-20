public class CountZero {
    static int countZero2(int num){
        if(num==0){
           
            return 0;
        }
        
        int count = countZero2(num/10);
        int singleDigit = num % 10;
        if(singleDigit==0){
            count = count + 1;
        }
        return count;
    }


    static void countZero(int num, int count){
        if(num==0){
            System.out.println("Count is "+count);
            return ;
        }
        int singleDigit = num % 10;
        if(singleDigit==0){
            count = count + 1;
        }
        countZero(num/10, count);
    }
    public static void main(String[] args) {
        countZero(10203, 0);
    }
}
