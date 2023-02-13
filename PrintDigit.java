public class PrintDigit {
    public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int count = 0;
        // Step -1 Count Digit
        while(copy!=0){
            copy= copy/10; // make number small
        count++;
        }
        int power = (int)Math.pow(10, count-1);
       // System.out.println(power);
        while(num!=0){
        System.out.println(num/power); // Print single digit
        num = num%power; // make number small
        power = power/10;
        }

    }
}
