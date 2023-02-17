public class GCD {
    public static void main(String[] args) {
        int x = 48, y = 54;
        while(x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        System.out.println("GCD : " + y);
    }
}
