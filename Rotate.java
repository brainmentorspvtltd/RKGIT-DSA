public class Rotate {
    public static void main(String[] args) {
        int num = 12345;
        int copy  = num;
        int count = 0;
        int r = 2;
        
        // Step -1 Count Digit
        while(copy!=0){
            copy= copy/10; // make number small
        count++;
        }
        r = r % count; // with in the range
        // Negative 
        if(r<0){
            r = count + r;
        }
        int rightPart = num % ((int)Math.pow(10,r));
        //System.out.println(rightPart);
        int remDigitCount = count - r;
        int leftPart = num / ((int)Math.pow(10,remDigitCount-1));
        //System.out.println(leftPart);
        int result = rightPart * ((int)Math.pow(10,remDigitCount)) + leftPart;
        System.out.println(result);
    }
}
