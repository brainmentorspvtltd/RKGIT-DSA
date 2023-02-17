public class PrimeNumberP3 {
    public static void main(String[] args) {
        int num = 100000007;
        // int num = 17;
        boolean isPrime = true;

        if(num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }

        int iter = 0;
        for(int i = 5; i*i <= num; i+=6) {
            iter++;
            if(num % i == 0 || num % (i+2) == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Number of Iterations : " + iter);

        if(isPrime) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime...");
        }
    }
}
