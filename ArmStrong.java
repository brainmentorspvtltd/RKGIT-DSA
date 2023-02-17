public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int result = 0;
        while(num != 0) {
            int rem = num % 10;
            result += Math.pow(rem, 3);
            num = num / 10;
        }
        if(result == temp) {
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
