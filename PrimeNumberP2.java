public class PrimeNumberP2 {
    public static void main(String[] args) {
        int num = 100000007;
        // int num = 997;
        // int num = 17;
        boolean isPrime = true;
        int iter = 0;
        for(int i = 2; i*i <= num; i++) {
            iter++;
            if(num % i == 0) {
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
