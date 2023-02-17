public class GCD_P2 {
    public static void main(String[] args) {
        int x = 24, y = 54;
        // Euclidean Algorithm
        while(x != y) {
            if(x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        System.out.println("GCD is : " + x);
    }
}
