public class Prime {

    /*static boolean isPrime(int num , int div){
       
    }*/  

    static void isPrime(int num , int div){
        if(num == div){
            System.out.println("Prime No");
            return ;
        }
            int rem = num % div;
            if(rem ==0){
                System.out.println("Not a Prime No");
                return;
            }
            isPrime(num, div+1);
    }
    public static void main(String[] args) {
        isPrime(5, 2);
    }
}
